package student_management_system;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. List All Students");
            System.out.println("3. Search Student by Reg No");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student registration number: ");
                    String regNo = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student department: ");
                    String department = scanner.nextLine();
                    Student student = new Student(regNo, name, department);
                    system.addStudent(student);
                    break;
                case 2:
                    system.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter student registration number to search: ");
                    String searchRegNo = scanner.nextLine();
                    Student foundStudent = system.searchStudent(searchRegNo);
                    if (foundStudent != null) {
                        System.out.println("Student found:");
                        System.out.println("Reg No: " + foundStudent.getRegNo() + ", Name: " + foundStudent.getName() + ", Department: " + foundStudent.getDepartment());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student registration number to delete: ");
                    String deleteRegNo = scanner.nextLine();
                    system.deleteStudent(deleteRegNo);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
