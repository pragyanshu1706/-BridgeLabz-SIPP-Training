import java.util.Scanner;

public class FactorsUsingWhile {

	public static void main(String[] args) {
		// Taking the input from the user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		if(number > 0) {
			//Finding factors
			int i = 1;
			while(number >= i) {
				if(number % i == 0) {
					System.out.println(i);
				}
				i++;
			}
		}

	}

}