/*
Annonymous class:-
created when we need to perform task at once.
A class which has no name means without name.
we can not create constructor for it.
we can not call new method outside of it.

*/

public class Annonymous {
    public static void main (String[] args) {
        Person p = new Person() {
            @Override
            void introduce () {
                greet();
                System.out.println("Hi, I am Suraj");
            }
            void greet () {
                System.out.println("Hello");
            }
        };
        p.introduce();

    }
}

class Person {
    void introduce() {
        System.out.println("Hi, I am a Person");
    }
}