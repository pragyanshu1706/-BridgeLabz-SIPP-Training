public class UnitConvertor {

    // 1. Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    // 2. Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // 3. Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // 4. Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // 5. Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Optional main method to test the conversions
    public static void main(String[] args) {
        System.out.println("5 yards to feet: " + convertYardsToFeet(5));
        System.out.println("15 feet to yards: " + convertFeetToYards(15));
        System.out.println("2 meters to inches: " + convertMetersToInches(2));
        System.out.println("20 inches to meters: " + convertInchesToMeters(20));
        System.out.println("10 inches to cm: " + convertInchesToCentimeters(10));
    }
}