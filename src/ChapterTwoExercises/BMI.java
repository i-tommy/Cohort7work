package ChapterTwoExercises;

import java.util.Scanner;
	public class BMI
{
	public static void main(String... args)
	{
	Scanner input = new Scanner(System.in);
	
	double weight;
	double height;
	double bmi;

	System.out.print("Enter weight in kilograms: ");
	weight = input.nextDouble();

	System.out.print("Enter height in metres: ");
	height = input.nextDouble();

	bmi = weight / (height * height);
	System.out.println("ChapterTwoExercises.BMI VALUES");
	
	if (bmi < 18.5);
	System.out.printf("Underweight: %f%n", bmi);

	if (bmi >= 18.5 && bmi <=24.9);
	System.out.printf("Normal: %f%n", bmi);

	if (bmi >= 25 && bmi <= 29.9);
	System.out.printf("Overweight: %f%n", bmi);

	if (bmi >= 30);
	System.out.printf("Obese: %f%n", bmi);
	}
}
	
	