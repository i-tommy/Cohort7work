package ClassActivities;

import java.util.Scanner;

public class Tuition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialTuition;
        double annualTuitionFee = 0;
        double totalTuitionFee = 0;
        double tenYears = 0;
        double fourYears = 0.0;
        double tuitionBonus;
        int count = 0;


        System.out.println("Enter the initial tuition fee: ");
        initialTuition = input.nextInt();

        while(count < 14.00){
            tuitionBonus = (5 * initialTuition) / 100;
            annualTuitionFee = initialTuition + tuitionBonus;
            initialTuition = annualTuitionFee;
            System.out.println("The tuition for the year is: "+annualTuitionFee);

            totalTuitionFee = totalTuitionFee + annualTuitionFee;

            if(count == 10){
                tenYears = totalTuitionFee;
            }

            if(count >10){
                fourYears = fourYears + annualTuitionFee;
            }
            count++;
        }
        System.out.println("The total tuition for 10 years is: "+tenYears);
        System.out.println("The total tuition from year 11 to 14 is: "+fourYears);
        System.out.println("The total tuition is: "+ totalTuitionFee);
    }
}
