public class InvoiceGenerator {
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int MINIMUM_FARE = 5;

    public static double CalculateFare(double distance,int time){
        double totalDistance = distance * MINIMUM_COST_PER_KILOMETER  + time * COST_PER_TIME;
        if (totalDistance < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalDistance;
    }

    public static void main(String[] args) {
        double FareOne = CalculateFare(2, 5);
        System.out.println("Fare is : " + FareOne);
    }
}
