/*
Immutable Class:-

-> we cannot change anything of this class once we declare.

what we need to do for an Immutable Class:-
1. Mark my class as final.
2. Mark my instance variable as Private and final.
3. There is no setter methods.
4. defensive copy of college (non-primitives)
*/

// Implemetation:-

public class ImmutableClass {
    public static void main (String[] args) {
        Student s1 = new Student("Suraj Kumar", 22);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}

// Immutable class
final class Student {
    private final String name;
    private final int age;

    Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}