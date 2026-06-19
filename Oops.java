/*

# OOps:- OOP is a programming paradigm that organizes code around objects rather than functions and logic.
-- oops helps developer to write code more clean and readable format and easy to maintain.
-- its piller:
1. Polymorphosm
2. Inheritence
3. abstraction
4. Encapsulation

# class:- A class is a blueprint or template for objects.

# object- Instance of a class.

*/

// How to create a class;

import java.util.*;

class Students {
    String name;
    int rollNo;
    int age;
    String college;

    void markAttendence() {
        System.out.println("Attendence Marked by "+name);
    }

    void print() {
        System.out.println("Name: "+name+", Roll Number: "+rollNo+", Age: "+age+", College: "+college);
    }
}

public class Oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        Students s2 = new Students();

        s1.name = sc.nextLine();
        s1.rollNo = sc.nextInt();
        s1.age = sc.nextInt();
        sc.nextLine();
        s1.college = sc.nextLine();

        s2.name = sc.nextLine();
        s2.rollNo = sc.nextInt();
        s2.age = sc.nextInt();
        sc.nextLine();
        s2.college = sc.next();

        s1.markAttendence();
        s2.markAttendence();
        s1.print();
        s2.print();
    }
}
