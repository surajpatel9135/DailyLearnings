// constructor chaining helps to call a constructor from another constructor...
// Using this keyword.
// constructor chaining helps to write code clean and reuse the code instead of writting over again and again..

class Student {
    String name;
    int rollNo;
    int age;
    String college;

    // default constructor
    Student() {
        this("Unknown", 0, 0, "Unknown");
    }
    Student(String name) {
        this(name, 0, 0, "Unknown");
    }
    Student(String name, int rollNo) {
        this(name, rollNo, 0, "Unknown");
    }
    Student(String name, int rollNo, int age) {
        this(name, rollNo, age, "Unknown");
    }
    Student(String name, int rollNo, int age, String college) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.college = college;
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Suraj", 0, 0, "Unknown");
        Student s3 = new Student("Suraj", 33, 0, "Unknown");
        Student s4 = new Student("Suraj", 33, 22, "Unknown");
        Student s5 = new Student("Suraj", 33, 22, "Parul University");

        System.out.println(s1.name);            // Unknown
        System.out.println(s1.rollNo);          // 0
        System.out.println(s1.age);             // 0
        System.out.println(s1.college);         // Unknown

        System.out.println(s2.name);            // Suraj
        System.out.println(s2.rollNo);          // 0
        System.out.println(s2.age);             // 0
        System.out.println(s2.college);         // Unknown

        System.out.println(s3.name);            // Suraj
        System.out.println(s3.rollNo);          // 33
        System.out.println(s3.age);             // 0
        System.out.println(s3.college);         // Unknown

        System.out.println(s4.name);            // Suraj
        System.out.println(s4.rollNo);          // 33
        System.out.println(s4.age);             // 22
        System.out.println(s4.college);         // Unknown

        System.out.println(s5.name);            // Suraj
        System.out.println(s5.rollNo);          // 33
        System.out.println(s5.age);             // 22
        System.out.println(s5.college);         // Parul University
    }
}

