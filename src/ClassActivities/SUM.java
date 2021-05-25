package ClassActivities;

import java.util.Scanner;

public class SUM {
        public static void main(String... arg) {


            Scanner scanner = new Scanner(System.in);

            {
                int counter = 0;
                int input = 0;
                int sum = 0;
                int avg = 0;

                while (counter <= 2) {
                    System.out.println("Enter num" + counter);
                    input = scanner.nextInt();
                    sum += input;
                    counter += 1;

                }
                System.out.println("the sum is: " + sum);
                double avgScore = (double) sum/counter;
                System.out.println("the avg is: " +avgScore);


            }
        }
    }

