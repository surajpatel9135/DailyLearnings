/*
Local Class :-
A class which is created inside a function, if statement, etc.
it can be access all fields, methods of outer class.
Local variables cannot be accessible in local class if it not effectively final.
we access it from outside of scope using Object class.
*/

public class LocalClass {
    public static void main (String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}

class Outer {
    int x = 56;

    void greet() {
        class Local {
            void sayHello() {
                System.out.println("Hello"); // Hello
                System.out.println(x);       // 56
            }
        }

        Local l = new Local();
        l.sayHello();
    }
}