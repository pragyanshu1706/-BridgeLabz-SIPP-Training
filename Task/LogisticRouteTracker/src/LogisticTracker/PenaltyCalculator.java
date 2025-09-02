package LogisticTracker;

@FunctionalInterface
interface PenaltyCalculator {
    double calculate(int expected, int actual);
}
