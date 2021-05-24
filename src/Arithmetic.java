import java.util.Scanner;
	public class Arithmetic
	{
		public static void main(String... args)
		{
			Scanner input = new Scanner(System.in);
			
			int num1;
			int num2;
			int sum;
			int product;
			int difference;
			int quotient;
			
			System.out.print("Enter 1st integer: ");
			num1 = input.nextInt();

			System.out.print("Enter 2nd integer: ");
			num2 = input.nextInt();
			
			sum = num1 + num2;
			System.out.printf("sum is %d%n", sum);
			
			product = num1 * num2;
			System.out.printf("product is %d%n", product);

			difference = num1 - num2;
			System.out.printf("difference is %d%n", difference);
			
			quotient = num1 / num2;
			System.out.printf("quotient is %d%n", quotient);
		}
}