import java.util.Scanner;
public class ComparingIntegers
{
	public static void main(String... args)
	{
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Enter firt integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		num2 = input.nextInt();

		if (num1 == num2)
		System.out.printf("%d == %d These numbers are equal%n", num1, num2);
		
		if (num1 > num2)
		System.out.printf("%d > %d The first integer is larger%n", num1, num2);

		if (num1 < num2)
		System.out.printf("%d < %d The second integer is larger%n", num1, num2);
	}
}