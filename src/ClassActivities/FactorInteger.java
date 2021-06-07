package ClassActivities;

import java.util.Scanner;

public class FactorInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 120;

        for (int i = 2; i <= num ; ++i){
            while(num % i == 0){

                System.out.println(i);
                num /= i;
            }
        }

    }
}

