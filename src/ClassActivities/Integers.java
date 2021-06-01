package ClassActivities;

import java.util.Scanner;

public class Integers {

    public static void main(String...arg){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

//Declare Scanner to take input from user

        Scanner collector = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");

//for loop that runs 10 times to take input from user

        for (int i = 0; i < 10; ++i) {

            int num = collector.nextInt();

//Check if the number is greater than max
            if (max < num)
                max = num;

//Check if the number is smaller than min
            if (min > num)
                min = num;
        }
//Print the Highest number which is stored in max
        System.out.println("Highest integer is " + max);

//Print the Lowest number which is stored in min
        System.out.println("Lowest integer is " + min);
    }

}
