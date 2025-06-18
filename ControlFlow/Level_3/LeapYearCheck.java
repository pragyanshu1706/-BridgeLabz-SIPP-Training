import java.util.*;
class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();
        if (year < 1582)
        System.out.println("Leap year check is only valid for years from 1582 onwards.");
        else {
           if (year % 4 != 0) 
           System.out.println(year + " is not a Leap Year.");
           else if (year % 100 != 0)
           System.out.println(year + " is a Leap Year.");
           else if (year % 400 == 0)
           System.out.println(year + " is a Leap Year.");
           else
           System.out.println(year + " is not a Leap Year.");
            
        }
    }
}