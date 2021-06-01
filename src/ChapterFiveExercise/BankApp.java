package ChapterFiveExercise;

import java.util.Scanner;

public class BankApp {

    public static void main(String... arg) {
        Scanner input = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("->enter 1 for deposit\n->enter 2 for withdraw\n->enter 3 to view All account\n->enter 4 to transfer\n" +
                    "->enter 5 to view your details\n->enter 6 to exit");

            userInput = input.nextInt();
            if (userInput == 1) {
                System.out.println("deposit");
            } else {
                if (userInput == 2) {
                    System.out.println("withdraw");
                } else {
                    if (userInput == 3) {
                        System.out.println("view All account");
                    } else {
                        if (userInput == 4) {
                            System.out.println("to transfer");
                        } else {
                            if (userInput == 5) {
                                System.out.println("view your details");
                            } else {
                                if (userInput == 6) {
                                    System.out.println("exit");
                                }
                            }
                        }
                    }
                }
            }
        }while (userInput == 6);
    }
}