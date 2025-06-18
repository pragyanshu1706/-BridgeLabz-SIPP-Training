
import java.util.Scanner;

public class GreatestFactorUsingFor {

	public static void main(String[] args) {
		// Taking the input from the user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int greatestFactor = 1;
		int number = input.nextInt();
		// Find Greatest Factor
		for(int i = number-1; i > 1; i--) {
			if(number % i == 0) {
				greatestFactor = i;
				break;
			}
		}
		System.out.println("Greatest Factor: " + greatestFactor);

	}

}