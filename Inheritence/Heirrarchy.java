class Heirrarchy {
    public static void main(String[] args) {
        Student s1 = new Student("Suraj Patel", 22, 33, "Parul University");
        s1.studentInfo();
        Employee e1 = new Employee("Amarjeet Patel", 26, 101, "Senior Embeded Eng.", "KPIT");
        e1.employeeInfo();
    }
}
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void personInfo() {
        System.out.print("Name: " + name + " | Age: " + age);
    }
}

class Student extends Person {
    private int rollNo;
    private String college;

    Student(String name, int age, int rollNo, String college) {
        super(name, age);
        this.rollNo = rollNo;
        this.college = college;
    }

    void studentInfo() {
        personInfo();
        System.out.println(" | Roll Number: " + rollNo + " | college: " + college);
    }
}

class Employee extends Person {
    private int ID;
    private String role;
    private String company;

    Employee(String name, int age, int ID, String role, String company) {
        super(name, age);
        this.ID = ID;
        this.role = role;
        this.company = company;
    }

    void employeeInfo() {
        personInfo();
        System.out.print(" | ID: " + ID + " | Roll : " + role + " | company: " + company);
    }
}