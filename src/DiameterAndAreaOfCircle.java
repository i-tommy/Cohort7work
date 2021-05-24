import java.util.Scanner;

public class DiameterAndAreaOfCircle
{
	public static void main(String... args)
	{
	Scanner input = new Scanner(System.in);
	
	int radius;
	int diameter;
	double circumference;
	double area;

	
	System.out.print("Enter 'radius': ");
	radius = input.nextInt();

	diameter = 2 * radius;
	System.out.printf("Diameter is %d%n", diameter);
	

	circumference = 2 * Math.PI * radius;
	System.out.printf("Circumference is %f%n", circumference);

	area = Math.PI * (radius * radius);
	System.out.printf("Area is %f%n", area);
	}
}