import java.util.Scanner;
	public class ArithmeticSmallestAndLargest
	{
		public static void main(String... args)
		{
			Scanner input = new Scanner(System.in);
			
			int num1;
			int num2;
			int num3;
			int sum;
			int average;
			int product;
			int smallest;
			int largest;
			
			System.out.print("Enter 1st integer: ");
			num1 = input.nextInt();

			System.out.print("Enter 2nd integer: ");
			num2 = input.nextInt();
			
			System.out.print("Enter 3rd integer: ");
			num3 = input.nextInt();

			sum = num1 + num2 + num3;
			System.out.printf("sum is %d%n", sum);

			average = sum / 3;
			System.out.printf("average is %d%n", average);
			
			product = num1 * num2 * num3;
			System.out.printf("product is %d%n", product);
			
			if (num1 > num2 && num1 < num3)

			

		}
}