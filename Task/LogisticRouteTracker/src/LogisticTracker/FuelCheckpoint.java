package LogisticTracker;

class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String id, String name, double distance, int expected, int actual) {
        super(id, name, distance, expected, actual);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "FuelCheckpoint"; }

    @Override
    public double calculatePenalty() {
        PenaltyCalculator calc = (expected, actual) -> (actual > expected) ? 10 : 0;
        return calc.calculate(expectedDuration, actualDuration);
    }
}
