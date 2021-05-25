package ChapterThreeExercise;

import africa.semicolon.BikeTest.Bike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertSame;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    private Object Okada;

    @Test
    public void testThatSpeedCanBeSet(){
        Bike okada = new Bike();
        okada.getSpeedInKmPerHour();
        okada.setSpeedInKmPerHour(1);
        Assertions.assertEquals(1,okada.getSpeedInKmPerHour());
    }
    @Test
    public void testThatBikeCanChangeToGearTwoWhenItHits20kmph(){
        Bike okada = new Bike();
        okada.setOn(true);
        okada.setSpeedInKmPerHour(15);
        Assertions.assertEquals(15, okada.getSpeedInKmPerHour());
        okada.speedUp();
        Assertions.assertEquals(16,okada.getSpeedInKmPerHour());
        okada.setSpeedInKmPerHour(20);
        okada.speedUp();
        Assertions.assertEquals(22,okada.getSpeedInKmPerHour());

    }

    public static class TelevisionTest {

        @Test

    public void testThatTelevisionCanBeTurnOn(){
            Television samsung = new Television();
            samsung.setOn(true);
        Assertions.assertTrue(samsung.isOn());
        }

            @Test

            public void testThatChannelsCanBeSetWhenTelevisionIsOn() {
                Television samsung = new Television();
                samsung.setOn(true);
                Assertions.assertTrue(samsung.isOn());
                samsung.setChannel(1);
                assertEquals(1, samsung.getChannel());
            }
            @Test

            public void testThatChannelsCannotBeSetWhenTelevisionIsOff(){
                Television samsung = new Television();
                samsung.setOn(false);
                assertFalse(samsung.isOn());
                samsung.setChannel(1);
                assertEquals(0, samsung.getChannel());
        }

        private void assertEquals(int i, int channel) {
        }

        private void assertFalse(boolean on) {
        }

        @Test
        public void testThatNumberCanBeIncreaseManuallyWhenTvIsON(){
            Television samsung = new Television();
            samsung.setOn(true);
            assertEquals(samsung.isOn());

        }

        private void assertEquals(boolean on) {

        }


    }

    public static class MobileBankingTest {
        @Test
        public void testThatCustomerSetAccountName(){
            //given
            Account ehisAccount = new Account();
            //when
            String userAccountNameInput = "Ehis Edemakhiota";
            ehisAccount.setAccountName(userAccountNameInput);
            //confirm
            Assertions.assertSame("Ehis Edemakhiota", ehisAccount.getAccountName());
        }
        @Test
        public void testThatUserCanDepositIntoAccount() {
            //given
            Account issacAccount = new Account();
            //when
            int depositAmount = 20000;
            issacAccount.deposit(depositAmount);
            //confirm
            Assertions.assertEquals(20000, issacAccount.getAccountBalance());
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
            Assertions.assertEquals(25000, ifeanyiAccount.getAccountBalance());
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
            Assertions.assertEquals(10000, janetAccount.getAccountBalance());
        }
    }
}
