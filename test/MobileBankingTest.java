import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class MobileBankingTest {
    @Test
    public void testThatCustomerSetAccountName(){
        //given
        Account ehisAccount = new Account();
        //when
        String userAccountNameInput = "Ehis Edemakhiota";
        ehisAccount.setAccountName(userAccountNameInput);
        //confirm
        assertSame("Ehis Edemakhiota", ehisAccount.getAccountName());
    }
    @Test
    public void testThatUserCanDepositIntoAccount() {
        //given
        Account issacAccount = new Account();
        //when
        int depositAmount = 20000;
        issacAccount.deposit(depositAmount);
        //confirm
        assertEquals(20000, issacAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCanDepositTwice() {
        //given
        Account ifeanyiAccount = new Account();
        //when
        int depositAmount = 20000;
        ifeanyiAccount.deposit(depositAmount);
        depositAmount = 5000;
        ifeanyiAccount.deposit(depositAmount);
        //confirm
        assertEquals(25000, ifeanyiAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCanWithdrawFromAccount(){
        //given
        Account janetAccount = new Account();
        //when
        int depositAmount = 12000;
        janetAccount.deposit(depositAmount);
        int withdrawalAmount = -2000;
        janetAccount.withdraw(withdrawalAmount);
        //confirm
        assertEquals(10000, janetAccount.getAccountBalance());
    }
}
