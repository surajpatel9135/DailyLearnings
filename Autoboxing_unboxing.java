
// Autoboxing:- it means we convert premitive data types to class or userdefined objects.

// Unboxing:- it means we convert object to premitive data types.


public class Autoboxing_unboxing {
    public static void main(String[] args) {
        // Autoboxing
        int x = 10;
        Integer y = x; // Autoboxing
        // internally what happens here
        // Integer y = new Integer(x); or Integer y = Integer.valueOf(x);

        System.out.println(x);
        System.out.println(y); // here java automatically perform unboxing

        // Unboxing
        Integer a = 20;
        int b = a.intValue();

        System.out.println(a);
        System.out.println(b);
    }
}