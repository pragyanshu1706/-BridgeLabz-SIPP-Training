package LogisticTracker;

import java.io.Serializable;

import LogisticTracker.RouteLinkedList.Node;

class RouteLinkedList<T extends Checkpoint> implements Serializable {
    public class Node implements Serializable {
        T checkpoint;
        Node next;
        Node(T cp) { this.checkpoint = cp; }
    }

    private Node head;

    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public boolean removeCheckpoint(String checkpointId) throws CheckpointNotFoundException {
        if (head == null) throw new CheckpointNotFoundException("Route empty!");
        if (head.checkpoint.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            return true;
        }
        Node temp = head;
        while (temp.next != null && !temp.next.checkpoint.getCheckpointId().equals(checkpointId)) {
            temp = temp.next;
        }
        if (temp.next == null) throw new CheckpointNotFoundException("Checkpoint not found!");
        temp.next = temp.next.next;
        return true;
    }

    public T findCheckpoint(String checkpointId) throws CheckpointNotFoundException {
        Node temp = head;
        while (temp != null) {
            if (temp.checkpoint.getCheckpointId().equals(checkpointId))
                return temp.checkpoint;
            temp = temp.next;
        }
        throw new CheckpointNotFoundException("Checkpoint not found!");
    }

    public double computeTotalDistance() {
        double sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.checkpoint.getDistanceFromLast();
            temp = temp.next;
        }
        return sum;
    }

    public double computeTotalPenalty() {
        double sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.checkpoint.calculatePenalty();
            temp = temp.next;
        }
        return sum;
    }

    public void printRoute() {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            Checkpoint cp = temp.checkpoint;
            System.out.println(i + ". " + cp.getType() + " – " + cp.getLocationName() +
                    " – " + (cp.isDelayed() ? "Delayed" : "On Time") +
                    " – Penalty: " + cp.calculatePenalty());
            temp = temp.next;
            i++;
        }
    }

    public boolean containsCritical(String type) {
        Node temp = head;
        while (temp != null) {
            if (temp.checkpoint.getType().equals(type)) return true;
            temp = temp.next;
        }
        return false;
    }
}
