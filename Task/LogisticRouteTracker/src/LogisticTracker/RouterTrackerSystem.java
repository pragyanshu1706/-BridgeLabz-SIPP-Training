package LogisticTracker;

import java.io.*;
import java.util.*;


public class RouterTrackerSystem {
    public static void main(String[] args) {
        try {
            Driver d1 = new Driver("D1204", "Kavita Nair");
            d1.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 40, 60, 70));
            d1.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 30, 20, 20));
            d1.addCheckpoint(new RestCheckpoint("C3", "Motel X", 20, 30, 65));
            d1.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30, 90, 105));

            d1.printSummary();

            // Save and Load example
            d1.saveToFile("driver.ser");
            Driver d2 = Driver.loadFromFile("driver.ser");
            System.out.println("\nLoaded from File:");
            d2.printSummary();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
