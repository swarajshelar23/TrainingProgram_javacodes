package DAY8.OOPS;

public class StudentAttendance {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Alice";
        student1.rollno = 101;
        student1.attendance = 0;

        Student student2 = new Student();
        student2.name = "Bob";
        student2.rollno = 102;
        student2.attendance = 0;

        student1.displayDetails();
        student1.markAttendance();
        student1.markAbsent();

        System.out.println();

        student2.displayDetails();
        student2.markAttendance();
        student2.markAttendance();


        student1.displayDetails();
        student1.markAttendance();
        student1.markAbsent();
    }
}
