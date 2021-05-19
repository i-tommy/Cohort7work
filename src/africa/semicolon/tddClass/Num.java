package africa.semicolon.tddClass;

import java.util.Scanner;

public class Num {
    public static void main(String... arg) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter int number: ");

        int Num = input.nextInt();

        if (Num >= 60)
            System.out.println("pass");

        else {
            System.out.println("fail");
        }
    }

}