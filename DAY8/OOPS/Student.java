package DAY8.OOPS;

public class Student {
    String name;
    int rollno;
    int attendance;

    void displayDetails(){
        System.out.println("Student name: " + name);
        System.out.println("Student roll number: " + rollno);
        System.out.println("Student attendance: " + attendance);
    }

    void markAttendance(){
        attendance++;
        System.out.println(name + " marked present. Total attendance: " + attendance);
    }

    void markAbsent(){
         attendance--;
        System.out.println(name + " marked absent. Total attendance: " + attendance);
    }

    
    
}

