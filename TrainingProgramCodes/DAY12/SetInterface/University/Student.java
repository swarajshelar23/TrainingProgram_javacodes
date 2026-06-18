package DAY12.SetInterface.University;
import java.util.*;
public class Student {
    private int studentId;
    private String studentName;
    private String email;
    private String course;

    Student(int studentId, String studentName, String email, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public int hashCode() {
       return Objects.hash(email.toLowerCase());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equalsIgnoreCase(other.email))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", course="
                + course + "]";
    }





   
}
