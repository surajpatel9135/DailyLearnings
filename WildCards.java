// wildCards(?):-
// -> in java, wildCards (represented by the question mark ?) are used in generics to represent an unknown type.
// -> They solve a fundamental restriction in Java generics: Generics are invariant. 
// -> This means that even though a String is a child of Object, a List<String> is not a child of List<Object>. 
// -> Wildcards provide the flexibility needed to handle inheritance structures within generic collections.
// -> List <?> list = new ArrayList<>();
// -> ?:- list of specific type but we don't know what it could be ?

// -> The Three Types Of WildCards (?):-

// 1. UnBounded wildCards:-
// -> This represents ony type.
// -> it is useful when your method only uses functionality provided by the base Object class or when the code doesn't depends on the actual types parameter.

// # Limitation of UnBounded:-
// -> you cannot add any elements to an UnBounded list (except null) because java can't guarantee what type of object the list is meant to hold.

// # Syntax:-
//             List<?>

// public static void printList(List<?> list) {
//     for (Object elem : list) {
//         System.out.print(elem + " ");
//     }
//     System.out.println();
// }
// // Works with List<Integer>, List<String>, List<Double>, etc.


// 2. Upper Bounded WildCards:-
// -> This restricts the unknown type to a specific type or its subclasses(children).
// -> it relaxes the restrictions on a variable, allowing it to accept a wider range of types the inheritence tree.

// Syntax:-
// List<? extends Number> (Accepts Integer, Double, Float, Byte, etc.)

// -> main use case: - Reading data (producer).

// code:-
// public static double sumOfList(List<? extends Number> list) {
//     double sum = 0.0;
//     for(Number n : list) {
//         sum += n.doubleValue(); // safe to read as a number
//     }
//     return sum;
// }

// // cannot add elements to this list because java doesn't know the exact subtype.

// 3. Lower Bounded wildCards:-
// -> This restricts the unknown type to a specific type or its superclasses (parents).

// Syntax:-
// List<? super Integer> (Accepts Integer, Number, object)

// -> Main use case: Writing data (Consumer).

// code :

// public static void addNumbers(List<? super Integer> list) {
//     for(int i = 1; i <= 5; i++) {
//         list.add(i);
//     }
// }
