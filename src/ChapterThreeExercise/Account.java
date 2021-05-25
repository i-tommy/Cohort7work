package ChapterThreeExercise;

import java.util.Scanner;

public class Account {
    String accountName;
    int accountBalance;

    public void setAccountName(String userAccountNameInput) {
        accountName = userAccountNameInput;
    }

    public String getAccountName() {
        return accountName;
    }

    public void deposit(int depositAmount) {
        accountBalance = accountBalance + depositAmount;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void withdraw(int withdrawalAmount) {



        }

        private static int nextInt() {
            return 0;
        }
}
