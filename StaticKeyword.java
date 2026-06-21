/*
-- static keyword is used for class variables.
-- we can access it using className.variable = "values";
-- static keyword can be variable and methods.
-- static methods can only access static variables.
-- static methods can call only static methods.
-- does not have access of this keyword.
-- static block is used to assign or initialize the static variables.
-- all instance variable can share it.
-- it is also known as class variable.

-- here we declare static variables.
static String college;
static int grade;

-- using static block:-

static {
    college = "Parul University";
    grade = 8;
    city = "Vadodara";
}

*/

class Student {
    String name;
    int rollNo;
    int age;
    static String college;

    Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // initialize static variable.
    static {
        college = "Parul University";
    }

}
public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul Yadav", 34, 24);
        Student s2 = new Student("Suraj Patel", 33, 22);

        System.out.println("Name: "+s1.name+", Roll no: "+s1.rollNo+", Age: "+s1.age+", College: "+Student.college);
        System.out.println("Name: "+s2.name+", Roll no: "+s2.rollNo+", Age: "+s2.age+", College: "+Student.college);
    }
}

// output:-
// Name: Rahul Yadav, Roll no: 34, Age: 24, College: Parul University
// Name: Suraj Patel, Roll no: 33, Age: 22, College: Parul University