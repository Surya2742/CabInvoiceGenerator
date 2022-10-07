public class InvoiceGenerator {
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int MINIMUM_FARE = 5;
    Ride[] rides;

    public static double CalculateFare(double distance,int time){
        double totalDistance = distance * MINIMUM_COST_PER_KILOMETER  + time * COST_PER_TIME;
        if (totalDistance < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalDistance;
    }

    public static double CalculateFare(Ride[] rides){
        double totalFare = 0;
        for(Ride ride:rides) {
            totalFare += CalculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }

    public static void main(String[] args) {
        double fareOne = CalculateFare(2, 5);
        System.out.println("Fare is : " + fareOne);

        Ride[] rides = {new Ride(2.0, 5),
                new Ride(5.0, 10),
                new Ride(0.1, 1),
                new Ride(20, 60)};
        double fareTwo = CalculateFare(rides);
        System.out.println("Multiple Fare is : " + fareTwo);
    }
}
