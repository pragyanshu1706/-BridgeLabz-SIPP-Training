package LogisticTracker;

class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String name, double distance, int expected, int actual) {
        super(id, name, distance, expected, actual);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "DeliveryCheckpoint"; }

    @Override
    public double calculatePenalty() {
        PenaltyCalculator calc = (expected, actual) -> (actual > expected) ? (actual - expected) * 2 : 0;
        return calc.calculate(expectedDuration, actualDuration);
    }
}