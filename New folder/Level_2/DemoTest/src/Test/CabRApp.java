package Test;


//Vehicle class
class Vehicle {
 protected String vehicleNumber;
 protected int capacity;
 protected String type;

 public Vehicle(String vehicleNumber, int capacity, String type) {
     this.vehicleNumber = vehicleNumber;
     this.capacity = capacity;
     this.type = type;
 }

 public String getVehicleNumber() {
     return vehicleNumber;
 }

 public int getCapacity() {
     return capacity;
 }

 public String getType() {
     return type;
 }
}

//Mini class extends Vehicle
class Mini extends Vehicle {
 public Mini(String vehicleNumber) {
     super(vehicleNumber, 4, "Mini");
 }
}

//Sedan class extends Vehicle
class Sedan extends Vehicle {
 public Sedan(String vehicleNumber) {
     super(vehicleNumber, 6, "Sedan");
 }
}

//SUV class extends Vehicle
class SUV extends Vehicle {
 public SUV(String vehicleNumber) {
     super(vehicleNumber, 8, "SUV");
 }
}

//Driver class
class Driver {
 private String name;
 private String licenseNumber;
 private double rating;

 public Driver(String name, String licenseNumber, double rating) {
     this.name = name;
     this.licenseNumber = licenseNumber;
     this.rating = rating;
 }

 public String getName() {
     return name;
 }

 public String getLicenseNumber() {
     return licenseNumber;
 }

 public double getRating() {
     return rating;
 }
}

//IRideService interface
interface IRideService {
 void bookRide(Vehicle vehicle, Driver driver, double distance);
 void endRide();
}

//RideService class implements IRideService
class RideService implements IRideService {
 private double baseFare;
 private double rate;
 private double distance;
 private double fare;
 private boolean isRideStarted;

 public RideService(double baseFare, double rate) {
     this.baseFare = baseFare;
     this.rate = rate;
     this.isRideStarted = false;
 }

 @Override
 public void bookRide(Vehicle vehicle, Driver driver, double distance) {
     if (!isRideStarted) {
         this.distance = distance;
         this.fare = calculateFare(distance);
         System.out.println("Ride booked successfully!");
         System.out.println("Vehicle: " + vehicle.getType());
         System.out.println("Driver: " + driver.getName());
         System.out.println("Fare: " + fare);
         isRideStarted = true;
     } else {
         System.out.println("Ride already started!");
     }
 }

 @Override
 public void endRide() {
     if (isRideStarted) {
         System.out.println("Ride ended successfully!");
         isRideStarted = false;
     } else {
         System.out.println("No ride in progress!");
     }
 }

 private double calculateFare(double distance) {
     return baseFare + distance * rate;
 }
}

public class CabRApp {
 public static void main(String[] args) {
     // Create vehicles
     Vehicle mini = new Mini("MH12AB1234");
     Vehicle sedan = new Sedan("MH12CD5678");
     Vehicle suv = new SUV("MH12EF9012");

     // Create drivers
     Driver driver1 = new Driver("John Doe", "DL123456", 4.5);
     Driver driver2 = new Driver("Jane Doe", "DL789012", 4.8);

     // Create ride service
     RideService rideService = new RideService(50, 10);

     // Book ride
     rideService.bookRide(mini, driver1, 10);

     // End ride
     rideService.endRide();
 }
}


