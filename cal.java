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

	       
					System.out.println("Multiplication: " + product);
					
				} else 
				{
					
					System.out.println("Multiplication: " + product);

    }
}
}