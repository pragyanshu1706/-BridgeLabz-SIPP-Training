import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		// Taking input number from the user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the countdown value: ");
		int counter = input.nextInt();
		while(counter > 0) {
			System.out.println(counter);
			counter--;
		}
		

	}

}