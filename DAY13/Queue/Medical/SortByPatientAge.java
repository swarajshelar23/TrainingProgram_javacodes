package DAY13.Queue.Medical;
import java.util.Comparator;
public class SortByPatientAge  implements Comparator<Patient> {
     @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getAge() - o2.getAge();
    }

}
