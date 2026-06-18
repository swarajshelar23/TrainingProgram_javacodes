package DAY12.SetInterface.University;

public class App {
    
    public static void main(String[] args) {
        AdmissionPanel admissionPanel = new AdmissionPanel();

        Student student1 = new Student(1, "Alice", "alice@gmail.com", "Computer Science");
        Student student2 = new Student(2, "Bob", "bob@gmail.com", "Mathematics");
        Student student3 = new Student(3, "Charlie", "charlie@gmail.com", "Physics");
        Student student4 = new Student(4, "Alice", "alice@gmail.com", "Biology");
        Student student5 = new Student(5, "Swaraj", "srs@gmail.com", "Chemistry");
        Student student6 = new Student(6, "Swaraj", "srs@gmail.com", "Chemistry")
;        


        admissionPanel.registerStudent(student1);
        admissionPanel.registerStudent(student2);
        admissionPanel.registerStudent(student3);
        admissionPanel.registerStudent(student4);
        admissionPanel.registerStudent(student5);
        admissionPanel.registerStudent(student6);
        admissionPanel.displayAllStudents();
        admissionPanel.removeStudent("alice@gmail.com");
        admissionPanel.displayStudentDetailsByEmail("bob@gmail.com");
        admissionPanel.displayStudentDetailsByEmail("charlie@gmail.com");
        admissionPanel.displayAllStudents();
        System.out.println("Total students: " + admissionPanel.getTotalStudents());
        admissionPanel.isEmpty();
        admissionPanel.displayStudentDetailsByEmail("srs@gmail.com");
        admissionPanel.updateStudentDetails("srs@gmail.com", "Srs", "Chemistry");
        admissionPanel.displayStudentDetailsByEmail("srs@gmail.com");

    }
}
