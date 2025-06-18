import java.util.Scanner;

public class IsFirstSmallest {

	public static void main(String[] args) {
		// Taking three numbers input from the user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		//Check whether first number is smallest
		boolean check = (number1 < number2 && number1 < number3);
		System.out.println("Is the first number the smallest? " + check);

	}

}