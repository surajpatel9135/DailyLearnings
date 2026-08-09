/*
Nested Classes:- A class within a class.
-> nested class can be inherited, impleneted, etc.

there are four types:
1. static class
2. Inner class
3. Local class
4. Annonymous class

Ex:-
class Outer {
    // Statements

    class Inner {
        // statements
    }
}
*/

// static class:-

// 1. does not need to create an instance for outer class.
// 2. class can be instantiated like a normal class.
// 3. can access only static members of outer class.
// 4. can access non-static members by having reference of outer class.
// 5. it is just like a normal class & can also do anything like an outer class does.

public class NestedClasses {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        Outer outer = new Outer();
        inner.fun(outer);
    }
}

class Outer {
    static int x = 20;
    int y = 40;

    static class Inner {

        void fun(Outer outer) {
            System.out.println(x);
            System.out.println(outer.y); // outer is reference of Outer class.
        }
    }
}