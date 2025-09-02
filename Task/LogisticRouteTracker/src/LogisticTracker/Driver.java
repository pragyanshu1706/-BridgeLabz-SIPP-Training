package LogisticTracker;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Driver implements Serializable {
    private String driverId;
    private String name;
    private RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void addCheckpoint(Checkpoint cp) {
        routeHistory.addCheckpoint(cp);
    }

    public void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();
        double distance = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = distance - penalty;
        System.out.println("Total Distance: " + distance + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);
        System.out.println("Critical Route Check: " +
                (routeHistory.containsCritical("DeliveryCheckpoint") &&
                 routeHistory.containsCritical("FuelCheckpoint")
                 ? "All required checkpoints present" : "Missing critical checkpoints"));
    }

    public void saveToFile(String filename) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
        }
    }

    public static Driver loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Driver) ois.readObject();
        }
    }
}
