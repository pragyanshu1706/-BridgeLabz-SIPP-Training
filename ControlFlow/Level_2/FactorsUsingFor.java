import java.util.Scanner;

public class FactorsUsingFor {

	public static void main(String[] args) {
		// Taking the input from the user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		if(number > 0) {
			//Finding factors
			for(int i = 1; i < number; i++) {
				if(number % i == 0) {
					System.out.println(i);
				}
			}
		}

	}

}