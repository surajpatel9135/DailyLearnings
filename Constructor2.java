/*
-- constructor called automatically when an object created.
-- constructor has no return type.
-- constructor name must be same as class name.
-- constructor is a special type of method.

-- it is three types:
1. default constructor
2. Non-argument constructor
3. parameterized constructor

Let's learn about all these.

*/

public class Constructor2 {
    public static void main(String[] args) {
        Student s1 = new Student(); // We create object here for default construct
       
        Student s3 = new Student("Shubham", 23, 24, "Parul University");

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.age);
        System.out.println(s1.college);

        

        System.out.println(s3.name);
        System.out.println(s3.rollNo);
        System.out.println(s3.age);
        System.out.println(s3.college);

        s1.study();
        
        s3.study();

        s1.markAttendence();
        
        s3.markAttendence();
    }
}

class Student {
    String name;
    int rollNo;
    int age;
    String college;

    Student(){
        // this is the default constructor...
    }
    
    // This is the parameterized constructor...
    Student(String n, int r, int a, String coll) {
        name = n;
        rollNo = r;
        age = a;
        college = coll;
    }
    void study() {
        System.out.println("Studying now.....");
    }

    void markAttendence() {
        System.out.println("Attendence marked");
    }
}