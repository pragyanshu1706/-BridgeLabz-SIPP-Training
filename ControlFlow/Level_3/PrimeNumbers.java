
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		boolean isPrime = true;
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				isPrime = false;
				break;
			} 
		}
		if(isPrime == true) {
			System.out.println("The number is prime.");
		} else {
			System.out.println("The number is not prime.");
		}
		

	}

}