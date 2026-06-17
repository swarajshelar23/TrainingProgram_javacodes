package DAY13.Queue.Priorityqueue.Aircraftsystem;

public class Aircraft implements Comparable<Aircraft> {
    private String flightNumber;
    private String airlineName;
    private int priority;
    private String destination;
    public Aircraft(String flightNumber, String airlineName, int priority, String destination) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.priority = priority;
        this.destination = destination;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public String getAirlineName() {
        return airlineName;
    }
    public int getPriority() {
        return priority;
    }
    public String getDestination() {
        return destination;
    }

    @Override
    public int compareTo(Aircraft other) {
        return Integer.compare(this.priority, other.priority);
    }
    @Override
    public String toString() {
        return "Aircraft [flightNumber=" + flightNumber + ", airlineName=" + airlineName + ", priority=" + priority
                + ", destination=" + destination + "]";
    }

    
    
}
