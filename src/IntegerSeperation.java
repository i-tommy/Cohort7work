import java.util.Scanner;
public class IntegerSeperation{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int num; 
	int num1; 
	int num2; 
	int num3; 
	int num4; 
	int num5;
 	
	System.out.println("Enter a five digits num: ");
	num = input.nextInt();

	if (num < 10000){
	System.out.println("Too less digits");}

	if (num > 99999){
	System.out.println("Too many digits");}

	else if (num >= 10000){
	num1 = (num / 10000);
	num2 = ((num % 10000)/1000);
	num3 = (((num % 10000) % 1000)/100);
	num4 = (((num % 10000) % 1000) % 100)/10;
	num5 = ((((num % 10000) % 1000) % 100) % 10)/1;
	System.out.printf("%d   %d   %d   %d   %d%n", num1, num2, num3, num4, num5);
	
		}

	} 

}
