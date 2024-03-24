package student_management_system;
import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayAllStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("Reg No: " + student.getRegNo() + ", Name: " + student.getName() + ", Department: " + student.getDepartment());
        }
    }

    public Student searchStudent(String regNo) {
        for (Student student : students) {
            if (student.getRegNo().equals(regNo)) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(String regNo) {
        Student studentToDelete = null;
        for (Student student : students) {
            if (student.getRegNo().equals(regNo)) {
                studentToDelete = student;
                break;
            }
        }
        if (studentToDelete != null) {
            students.remove(studentToDelete);
            System.out.println("Student with reg no " + regNo + " deleted successfully.");
        } else {
            System.out.println("Student with reg no " + regNo + " not found.");
        }
    }
}
