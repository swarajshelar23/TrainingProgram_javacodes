package DAY12.SetInterface.University;
import java.util.*;
public class AdmissionPanel {
    Set<Student> student = new HashSet<>();

    //Register a student
    void registerStudent(Student student){
        if(student.getEmail() == null || student.getEmail().isEmpty()){
            System.out.println("Invalid student email.");
            return;
        }

        if(this.student.add(student)){
            System.out.println("-----------------------");
            System.out.println("Student registered successfully.");
        } else {
            System.out.println("-----------------------");
            System.out.println("Student with email " + student.getEmail() + " is already registered.");
        }
    }

    //Register multiple students
    void registerMultipleStudents(List<Student> students){
        for(Student s : students){
            registerStudent(s);
        }
    }

    //Remove a student
    void removeStudent(String email){
        System.out.println("-----------------------");

        if(student.isEmpty()){
            System.out.println("No students registered.");
            return;
        }
        for(Student s : student){
            if(s.getEmail().equalsIgnoreCase(email)){
                student.remove(s);
                System.out.println("Student with email " + email + " removed successfully.");
                return;
            }
        }
        
        System.out.println("Student with email " + email + " not found.");
        System.out.println("-----------------------");
    }

    //search student by email
    void searchStudentByEmail(String email){
        System.out.println("-----------------------");
        if(student.isEmpty()){
            System.out.println("No students registered.");
            return;
        }
        for(Student s : student){
            if(s.getEmail().equalsIgnoreCase(email)){
                System.out.println("Student found: " + s.getStudentName());
                System.out.println("-----------------------");
                return;
            }
        }
        System.out.println("Student with email " + email + " not found.");
        System.out.println("-----------------------");
    }

    //display student details by email
    public void displayStudentDetailsByEmail(String email){
        if(student.isEmpty()){
            System.out.println("No students registered.");
            return;
        }
        System.out.println("-----------------------");
        for(Student s : student){
            if(s.getEmail().equalsIgnoreCase(email)){
                System.out.println("Student ID: " + s.getStudentId());
                System.out.println("Student Name: " + s.getStudentName());
                System.out.println("Email: " + s.getEmail());
                System.out.println("Course: " + s.getCourse());
                return;
            }
        }
        System.out.println("-----------------------");
        System.out.println("Student with email " + email + " not found.");
    }

    //total count of students
    public int getTotalStudents(){
        System.out.println("-----------------------");
        return student.size();
        
    }
    //Empty ?
    public boolean isEmpty(){
        if(student.isEmpty()){
            System.out.println("-----------------------");
            System.out.println("No students registered.");
            return true;
        }        return false;
        
    }

    //clear all students
    public void clearAllStudents(){
        student.clear();
        System.out.println("All students have been cleared.");
        System.out.println("-----------------------");
    }
    //Update student details
    public void updateStudentDetails(String email, String newName, String newCourse) {
    boolean found = false;
    System.out.println("-----------------------");

    for (Student s : student) {
        if (s.getEmail().equalsIgnoreCase(email)) {
            s.setStudentName(newName);
            s.setCourse(newCourse);
            found = true;
            break;
        }
    }

    if (found) {
        System.out.println("Student details updated successfully.");
        System.out.println("-----------------------");
    } else {
        System.out.println("Student with email " + email + " not found.");
        System.out.println("-----------------------");
    }
    }
    

    //Display all registered students
    public void displayAllStudents(){
        if(student.isEmpty()){
            System.out.println("No students registered.");
            return;
        }
        System.out.println("Registered Students:");
        for(Student s : student){
            System.out.println("Student ID: " + s.getStudentId());
            System.out.println("Student Name: " + s.getStudentName());
            System.out.println("Email: " + s.getEmail());
            System.out.println("Course: " + s.getCourse());
            System.out.println("-----------------------");
        }
    }

}
