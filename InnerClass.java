/*Inner Class:- 
A nested class in which inner class is non-static class.
Ex:-
class Outer {
    class Inner {

    }
}
Key properties:-
1. in Inner nested class, every Inner class has refenrence of outer class.
2. both classes have seperate heap memory.
3. Inner class can access all fields, methods and variables of outer class.
4. every inner class linked with outer class we can not create object of inner class until we can create object of outer class.
5. first we need to create object of outer class then we can create object of inner class.
6. we create object in different way:
-> first way:-
Outer outer = new Outer();
Outer.Inner inner = Outer.new Inner();

-> second way:-
Outer.Inner inner = new Outer.new Inner();

*/

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer(); // object of outer class
        Outer.Inner inner = outer.new Inner(); // object of inner class
        inner.print(); // call print method
    }
}

class Outer {
    int x = 20;

    class Inner {
        int x = 40;
        
        void print() {
            System.out.println(x); // 40
            System.out.println(Outer.this.x); // 20
        }
    }
}