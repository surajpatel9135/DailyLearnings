public class SimpleInheritence {
    public static void main(String[] args) {
        EngStudent s1 = new EngStudent("Suraj Patel", 33, 22, "Parul University", "7A9");
        s1.engStudentInfo();
    }
}

class Student {
    protected String name;
    protected int rollNo;
    protected int age;

    Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    void studentInfo() {
        System.out.print("Name: " + name + " | Roll Number: " + rollNo + " | Age: " + age);
    }
}

class EngStudent extends Student {
    private String college;
    private String div;

    EngStudent(String name, int rollNo, int age, String college, String div) {
        super(name, rollNo, age);
        this.college = college;
        this.div = div;
    }
    void engStudentInfo() {
        studentInfo(); 
        System.out.println(" | college name: " + college + " | Division: " + div);
    }
}