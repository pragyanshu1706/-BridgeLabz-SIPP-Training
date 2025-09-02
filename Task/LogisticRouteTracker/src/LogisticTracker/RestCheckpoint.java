package LogisticTracker;

class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String name, double distance, int expected, int actual) {
        super(id, name, distance, expected, actual);
    }

    @Override
    public boolean isCritical() { return false; }

    @Override
    public String getType() { return "RestCheckpoint"; }

    @Override
    public double calculatePenalty() {
        PenaltyCalculator calc = (expected, actual) -> {
            int delay = actual - expected;
            return (delay > 30) ? delay * 0.5 : 0;
        };
        return calc.calculate(expectedDuration, actualDuration);
    }
}
