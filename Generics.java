/*
Generics:-
-> it helps to read multiple data types without creates seperate classes for each data types.
-> we can decide its data types at the time of object creation.
-> using this we don't need to perform downcasting.
-> using this we can't lost types information and also shift runtime error to compile time error.
-> generics <A> is not subtype of generics<B>.
-> we can't point an object of a class in reference of another objects.
-> we can extends parent class and also implements interface in generics.
-> generics classes worked on anytypes of data but we need to mentioned the data type at the time of object creation.
EX:- Box <Integer> b1 = new Box(); // this is only for integers.
    Box <String> b2 = new Box(); // for strings
    Box <Boolean> b3 = new Box(); // for boolean
    and so on......;


-> 

*/

public class Main {
    public static void main(String[] args) {
        Integer x = getValue(24);
        System.out.println(x);
        
        String s = getValue("Suraj");
        System.out.println(s);
        
        Boolean b = getValue(false);
        System.out.println(b);
        
        printPair(22, "suraj");
        printPair(22, 55);
    }
    
    public static <T> T getValue(T value) {
        return value;
    }
    
    // here apply type inference: means there is no need to declare types compiler automatically detect the type according to its values.
    public static <T, U> void printPair(T first, U second) {
        System.out.println(first+" , "+second);
    }
}


/*

generics Bounds:- 
-> generics bounds helps to work on specific data types like we want to work only Numbers and when we read the input then its only takes Integers, Float, double, and so on.
-> generics bounds extends number class so that can be accept numeric values even it is integer or duoble etc.

public class GenericsBounds {
    public static void main(String[] args) {
        Box <Integer> b1 = new Box(123);
        Box <Float> b2 = new Box(); // even we replace the float or Integer from number.
    }
}

class Box <T extends number> {
    T value;

    public void printDouble() {
        System.out.println(value.doubleValue()); // 123.0
    }
}
    */
