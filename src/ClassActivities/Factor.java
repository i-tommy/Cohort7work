package ClassActivities;

import java.util.Scanner;

public class Factor {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int factor = 2;
        System.out.println("Enter num");
        int number = scanner.nextInt();
        while (factor <= number) {
            if (number % factor == 0){
                count++;}
            factor++;
        }
        System.out.println(count);
    }

}

