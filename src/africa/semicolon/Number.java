package africa.semicolon;

import java.util.Scanner;

public class Number {
    public static void main(String... arg) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter int number: ");
        int Number = input.nextInt();

        if (Number < 60)
            System.out.println("fail");

        if (Number >= 60)
            System.out.println("pass");

    }

}
