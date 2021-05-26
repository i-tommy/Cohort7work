package ClassActivities;

import java.util.Scanner;

public class Num {

        public static void main (String...arg){
            Scanner input = new Scanner(System.in);

            double grade;
            double num = 0;
            double sum = 0;
            System.out.println("enter number of students in class");
            double students = input.nextInt();

            while (num < students) {
                System.out.println("enter the grades of student:");
                grade = input.nextInt();
                sum = grade + sum;
                num++;
            }
            double avg = sum/students;
            System.out.println("the sum is: " + sum);
            System.out.println("the avg is: " +avg);

        }

    }


