import java.util.Scanner;

public class CheckDivisibleByFive {

	public static void main(String[] args) {
		// Taking the input number from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		boolean state = number % 5 == 0;
		System.out.println("Is the number " + number + " divisible by 5? " + state);

	}

}