package DAY13.Queue.Medical;

public class System {
    public static void main(String[] args){
        Hospital hospital = new Hospital();

        Patient p1 = new Patient(1, "Alice", 30, "Flu");
        Patient p2 = new Patient(2, "Bob", 45, "Back Pain");
        Patient p3 = new Patient(3, "Charlie", 25, "Headache");

        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        hospital.viewNextPatient();

        hospital.callPatient();
        hospital.viewNextPatient();

        hospital.displayPatients();
    }
}
