package DAY13.Queue.Medical;

import java.util.LinkedList;
import java.util.Queue;

public class Hospital {

    Queue<Patient> line = new LinkedList<>();

    // Add one patient
    void addPatient(Patient pt) {
        line.offer(pt);
        java.lang.System.out.println("Patient Added : " + pt.getName());
    }

    // Add multiple patients
    void addMultiplePatients(Patient[] patients) {

        for (Patient pat : patients) {
            addPatient(pat);
        }

        java.lang.System.out.println("All patients added successfully.");
    }

    // View next patient
    void viewNextPatient() {

        if (line.isEmpty()) {
            java.lang.System.out.println("No patients in queue.");
            return;
        }

        java.lang.System.out.println("Next Patient : " + line.peek());
    }

    // Call patient
    Patient callPatient() {

        if (line.isEmpty()) {
            java.lang.System.out.println("No patients available.");
            return null;
        }

        Patient patient = line.poll();

        java.lang.System.out.println("Calling Patient : " + patient.getName());

        return patient;
    }

    // Display queue
    void displayPatients() {

        if (line.isEmpty()) {
            java.lang.System.out.println("Queue is empty.");
            return;
        }

        java.lang.System.out.println("\nPatients in Queue:");

        for (Patient patient : line) {
            java.lang.System.out.println(patient);
        }
    }

    boolean checkQueue(){
        if (line.isEmpty()) {
            java.lang.System.out.println("Queue is empty.");
            return false;
        } else {
            java.lang.System.out.println("Queue is not empty.");
            return true;
        }
    }

    
}