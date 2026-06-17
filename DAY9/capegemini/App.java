package Day9.Practice;

public class App {
    public static void main(String[] args) {
        Capgemini Pankaj = new Capgemini(true, 5, 9.5, "Developer");

        Capgemini Appurva = new Capgemini(false, 3, 12.5, "Manager");

        Capgemini Kanchan = new Capgemini(true, 1, 20.2, "Director");

        // Appurva.showEmpDetails();

        // Appurva.UpdateWorkingDays("Manager", 2);

        // Appurva.showEmpDetails();

        // Pankaj.showEmpDetails();

        // Pankaj.UpdateWorkingDays("Developer", 1);

        // Pankaj.showEmpDetails();

        // Appurva.Updateappraisal("Manager", 16.5);

        // Appurva.showEmpDetails();

        Kanchan.Updateappraisal(Pankaj, 15.55);

        Pankaj.showEmpDetails();

    }
}