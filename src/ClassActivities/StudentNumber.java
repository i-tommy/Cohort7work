package ClassActivities;

import java.util.Scanner;

public class StudentNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentName;
        int numberOfStudent;
        int studentScore=0;
        int count = 0;
        int highestScore = Integer.MIN_VALUE;
        String highestStudentName = "";
        System.out.println("Enter the number of student: ");
        numberOfStudent = input.nextInt();
        while(count < numberOfStudent){
            System.out.println("Enter the student name: ");
            studentName = input.next();
            System.out.println("Enter the student score: ");
            studentScore = input.nextInt();

            if(studentScore > highestScore){
                highestStudentName = studentName;
                highestScore = studentScore;
            }
            count++;
        }

        System.out.println("Student name is" + highestStudentName);
    }
}
