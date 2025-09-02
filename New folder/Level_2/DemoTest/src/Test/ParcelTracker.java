package Test;

public class ParcelTracker {

    private Stage head;

    // Add standard stage to the end
    public void addStage(String name) {
        Stage newStage = new Stage(name);
        if (head == null) {
            head = newStage;
            return;
        }
        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    // Add custom stage after a given stage
    public void addCustomStageAfter(String targetStage, String customStageName) {
        Stage temp = head;
        while (temp != null) {
            if (temp.name.equals(targetStage)) {
                Stage newStage = new Stage(customStageName);
                newStage.next = temp.next;
                temp.next = newStage;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage '" + targetStage + "' not found.");
    }

    // Simulate a lost parcel by breaking the chain after a specific stage
    public void markAsLostAfter(String stageName) {
        Stage temp = head;
        while (temp != null) {
            if (temp.name.equals(stageName)) {
                temp.next = null;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage '" + stageName + "' not found.");
    }

    // Print the journey of the parcel
    public void trackParcel() {
        if (head == null) {
            System.out.println("No parcel data.");
            return;
        }
        Stage temp = head;
        while (temp != null) {
            System.out.println("Stage: " + temp.name);
            temp = temp.next;
        }
        System.out.println("End of tracking.");
    }

}
