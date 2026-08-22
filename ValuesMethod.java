/*
1. In java, values() method return an array containing all constants defined inside an enum.
2. values() method helps us to only extract the data values from a collection (like a dictionary, List, maps, objects, arrays, or enums).
3. in java, we can use it in two distinct purposes:
-> Map.values()
-> enum.values()

*/

public class ValuesMethod {
    public static void main (String[] args) {
        

        // here creates an array directions which is stored the constants of Direction.
        Direction [] directions = Direction.values();

        // here we iterate through the values of this array.
        for(Direction d : directions) {
            System.out.println(d.name());
        }
    }
}

enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST;
}

/*
    OUTPUT:-
            NORTH
            SOUTH
            EAST
            WEST

*/