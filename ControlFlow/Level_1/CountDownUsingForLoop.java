import java.util.Scanner;

public class CountDownUsingForLoop {

	public static void main(String[] args) {
		// Taking input number from the user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the countdown value: ");
		int counter = input.nextInt();
		for(int i = counter; i > 0; i--) {
			System.out.println(i);
		}

	}

}