package ClassActivities;

import java.util.Scanner;

public class Sentinelloop {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);

        int numberOfStudents = 0;
        int grade = 0;
        int sum = 0;
        while (grade != -1) {
            System.out.println("enter the grade of the student: ");
            grade = input.nextInt();
            if (grade != -1){
                sum = grade + sum;
                numberOfStudents++;
            }
        }

        double avg = (sum/(numberOfStudents*1.0));
        System.out.println("number of students are"+numberOfStudents);
        System.out.println("the sum is: " + sum);
        System.out.println("the avg is: " +avg);

    }
}
