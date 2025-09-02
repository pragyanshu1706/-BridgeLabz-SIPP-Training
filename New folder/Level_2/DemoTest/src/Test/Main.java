package Test;

public class Main {
    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        tracker.addCustomStageAfter("Shipped", "At Customs");

        tracker.markAsLostAfter("In Transit"); // Simulate parcel getting lost after this stage

        tracker.trackParcel();
    }
}