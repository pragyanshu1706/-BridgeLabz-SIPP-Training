import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice;
        int quantity;

        System.out.print("Enter unit price in INR: ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + 
            " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}