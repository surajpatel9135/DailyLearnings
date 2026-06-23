class Multi_level_inheritence {
    public static void main(String[] args) {
        CSEEngStudent s1 = new CSEEngStudent("Suraj Patel", 33, 22, "Parul University", "7A9", "JAVA");
        s1.CSEEngStudentInfo();
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
    protected String college;
    protected String div;

    EngStudent(String name, int rollNo, int age, String college, String div) {
        super(name, rollNo, age);
        this.college = college;
        this.div = div;
    }
    void engStudentInfo() {
        studentInfo(); 
        System.out.print(" | college name: " + college + " | Division: " + div);
    }
}

class CSEEngStudent extends EngStudent {
    private String subject;

    CSEEngStudent(String name, int rollNo, int age, String college, String div, String subject) {
        super(name, rollNo, age, college, div);
        this.subject = subject;
    }

    void CSEEngStudentInfo() {
        engStudentInfo();
        System.out.println(" | Subject: "+subject);
    }
}