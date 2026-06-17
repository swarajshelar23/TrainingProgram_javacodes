package DAY13.Priorityqueue.Aircratsystem;

import java.util.*;

public class AirportRunway {

    private PriorityQueue<Aircraft> runwayQueue =
            new PriorityQueue<>();

    private Set<String> flightNumbers =
            new HashSet<>();


    // Add Single Aircraft
    public void addAircraft(Aircraft aircraft) {

        if (aircraft.getPriority() < 1 ||
                aircraft.getPriority() > 4) {

            System.out.println("Invalid Priority!");
            return;
        }

        if (flightNumbers.contains(
                aircraft.getFlightNumber())) {

            System.out.println(
                    "Duplicate Flight Number: "
                            + aircraft.getFlightNumber());

            return;
        }

        runwayQueue.offer(aircraft);
        flightNumbers.add(
                aircraft.getFlightNumber());

        System.out.println(
                "Aircraft Added : "
                        + aircraft.getFlightNumber());
    }

    // Add Multiple Aircraft
    public void addMultipleAircraft(
            Aircraft[] aircrafts) {

        for (Aircraft aircraft : aircrafts) {
            addAircraft(aircraft);
        }
    }

    // Allocate Runway
    public Aircraft allocateRunway() {

        if (runwayQueue.isEmpty()) {

            System.out.println(
                    "No aircraft waiting.");
            return null;
        }

        Aircraft aircraft =
                runwayQueue.poll();

        flightNumbers.remove(
                aircraft.getFlightNumber());

        System.out.println(
                "Runway Allocated To : "
                        + aircraft.getFlightNumber());

        return aircraft;
    }

    // View Next Aircraft
    public void viewNextAircraft() {

        if (runwayQueue.isEmpty()) {

            System.out.println(
                    "Runway Queue Empty");
            return;
        }

        System.out.println(
                "Next Aircraft : "
                        + runwayQueue.peek());
    }

    // Display All Aircraft
    public void displayAircraft() {

        if (runwayQueue.isEmpty()) {

            System.out.println(
                    "No Aircraft Waiting");
            return;
        }

        System.out.println(
                "\nWaiting Aircraft:");

        for (Aircraft aircraft :
                runwayQueue) {

            System.out.println(aircraft);
        }
    }

    // Total Aircraft
    public void totalAircraft() {

        System.out.println(
                "Total Aircraft : "
                        + runwayQueue.size());
    }

    // Reset Queue
    public void resetQueue() {

        runwayQueue.clear();
        flightNumbers.clear();

        System.out.println(
                "Runway Queue Reset Successfully");
    }
}