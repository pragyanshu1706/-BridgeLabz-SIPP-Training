import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for a, b, and c
        System.out.print("a: ");
        int a = sc.nextInt();
        
        System.out.print("b: ");
        int b = sc.nextInt();
        
        System.out.print("c: ");
        int c = sc.nextInt();
        
        int result1 = a + b * c;      
        int result2 = a * b + c;      
        int result3 = c + a / b;      
        int result4 = a % b + c;      
        
        // Printing the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + 
                           ", " + result3 + ", and " + result4);
        
    }
}