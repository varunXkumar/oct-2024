import java.util.*;
public class cal
{
    	public static void main(String[] args) 
	{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter the first number: ");
				double num1 = scanner.nextDouble();

				System.out.print("Enter the second number: ");
				double num2 = scanner.nextDouble();

				double sum = num1 + num2;
				double difference = num1 - num2;
				double product = num1 * num2;
	        
	       
				if (num2 != 0) 
				{
					double quotient = num1 / num2;
					double remainder = num1 % num2;

	       
					System.out.println("Addition: " + sum);
					System.out.println("Subtraction: " + difference);
					System.out.println("Multiplication: " + product);
					System.out.println("Division: " + quotient);
					System.out.println("Modulus (Remainder): " + remainder);
				} else 
				{
					System.out.println("Cannot divide by zero.");
					System.out.println("Addition: " + sum);
					System.out.println("Subtraction: " + difference);
					System.out.println("Multiplication: " + product);

    }
}
}