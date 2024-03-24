package student_management_system;
public class Student {
    private String regNo;
    private String name;
    private String department;

    public Student(String regNo, String name, String department) {
        this.regNo = regNo;
        this.name = name;
        this.department = department;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

