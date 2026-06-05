class Student {
    int age;
    long id;
    String name;

    Student() {
        System.out.println("Default constructor..");
    }
    Student(long id) {
        this.id = id;
        System.out.println("Student ID: "+id);
    }
    Student(long id, int age) {
        this.id = id;
        this.age = age;
        System.out.println("Student ID: "+id+"\nStudent Age: "+age);
    }
    Student(long id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Student name: "+name+"\nStudent ID: "+id);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student(2303051051367L);

        Student s3 = new Student(2303051051367L, 21);

        Student s4 = new Student(2303051051367L, "suraj kumar");
    }
}