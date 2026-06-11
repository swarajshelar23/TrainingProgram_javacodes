package Day9.Practice;

public class Capgemini {
    private boolean insurance;
    private int workingDays;
    private double appraisal;
    private String role;

    Capgemini() {

    }

    Capgemini(boolean insurance, int workingDays, double appraisal, String role) {
        this.insurance = insurance;
        this.workingDays = workingDays;
        this.appraisal = appraisal;
        this.role = role;

    }

    public void UpdateWorkingDays(String role, int days) {
        if (role.equals("Manager") || role.endsWith("Director")) {
            this.workingDays = days;
        }
    }

    public void Updateappraisal(Capgemini obj, double amt) {
        if (this.role == "Director") {
            obj.appraisal = amt;
        }
    }

    public void showEmpDetails() {
        System.out.println(insurance + " " + workingDays + " " + appraisal + " " + role + " ");
    }

}