package DAY7.String;
import java.util.Scanner;

public class Employee {
    static void employeeDetails(String name[]){
        for(int i = 0; i < name.length; i++){
            System.out.println("Employee name: " + name[i]);
        }
    }
    static void searchEmployeeByFirstName(String name[], String searchName){
        for(int i = 0; i < name.length; i++){
            name[i] = name[i].split(" ")[0];
            if(name[i].equals(searchName)){
                System.out.println("Employee found: " + name[i]);
                return;
            }
        }
        System.out.println("Employee not found: " + searchName);
    }

    static void searchEmployeeByLastName(String[] name) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter last name to search: ");
    String str = sc.nextLine();

    for (int i = 0; i < name.length; i++) {
        String[] parts = name[i].split(" ");

        if (parts.length > 1) {
            String lastName = parts[parts.length - 1];

            if (lastName.equalsIgnoreCase(str)) {
                System.out.println("Employee found: " + name[i]);
                return;
            }
        }
    }

    System.out.println("Employee not found: " + str);
}
    static void CountEmployee(String name[]){
        System.out.println("Total number of employees: " + name.length);
    }

    static void LongestEmployeeName(String name[]){
        String longestName = "";
        
        for(int i = 0; i < name.length; i++){
            name[i] = name[i].split(" ")[0];
            if(name[i].length() > longestName.length()){
                longestName = name[i];
            }
        }
        System.out.println("Longest employee name: " + longestName);
    }

    static void ConvertToUpper(String name[]){
        for(int i = 0; i < name.length; i++){
            name[i] = name[i].toUpperCase();
            System.out.print(" "+name[i]+" ");
        }
    }

    public static void main(String[] args){
        String[] employees = {"Swaraj Shelar", "Alice Johansone", "Bob Smith", "Charlie Brown"};
        
        employeeDetails(employees);
        CountEmployee(employees);
        searchEmployeeByFirstName(employees, "Alice");
        searchEmployeeByLastName(employees);
        LongestEmployeeName(employees);
        ConvertToUpper(employees);
    }
}


