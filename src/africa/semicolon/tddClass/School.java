package africa.semicolon.tddClass;

/*total students grades is 100
student grades 90 above gives A
student grades 80 to 89 gives B
student grades 70 to 79 gives C
student grades 60 to 69 gives D
students grades 50 below gives F
 */


import java.util.Scanner;

public class School {

    public static void main(String... arg) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter int number: ");

        int Number = input.nextInt();

        if (Number >= 90) {
            System.out.println("A");
        } else if (Number >= 80){
            System.out.println("B");
        } else if (Number >= 70){
            System.out.println("C");
        }  else if (Number >= 60){
            System.out.println("D");
        }   else if (Number <= 50){
            System.out.println("F");
        }

    }



}