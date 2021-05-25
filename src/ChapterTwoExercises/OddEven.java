package ChapterTwoExercises;

import java.util.Scanner;
	public class OddEven
{
	public static void main(String... args)
	{
	Scanner input = new Scanner(System.in);
	
	int num;

	System.out.print("Enter num: ");
	num = input.nextInt();

	if (num % 2 == 0)
	System.out.printf("%d is an even num%n", num);

	if (num % 2 != 0)
	System.out.printf("%d is an odd num%n", num);
	}

}