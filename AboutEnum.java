/*
Before Enum:-
1. Type safety
2. poor readability
3. No grouping od related entities
4. duplicates values

-> After enum these all problems are solved.
-> enum stands for enumeration
-> It is predefined set of constants.

EX:-

enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST;
}

-> this is the enum structure or syntax.
-> we write it like this but internally it look like this:

final class Direction extends Enum <Direction> {
    public static final Direction NORTH = new Direction ();
    public static final Direction SOUTH = new Direction ();
    public static final Direction EAST = new Direction ();
    public static final Direction WEST = new Direction ();
}

-> actually enum is like a class but its objects are not instantiate outside from this class.
-> we can create its objects inside this class only.
-> every enum is override from parent enum class which is present in the java.lang package.
-> each methods or fields are declared as static & final
-> in this we made constructor as private which is not accessed from outside.

*/

public class AboutEnum {
    public static void main (String[] args) {
        Direction d1 = Direction.NORTH;
        d1.move();
        Direction d2 = Direction.SOUTH;
        d2.move();
        Direction d3 = Direction.EAST;
        d3.move();
        Direction d4 = Direction.WEST;
        d4.move();
    }
}

enum Direction {
    NORTH {
        @Override
        public void move() {
            System.out.println("Move up (Y + 1)");
        }
    },

    SOUTH {
        @Override
        public void move() {
            System.out.println("Move down (Y - 1)");
        }
    },

    EAST {
        @Override
        public void move() {
            System.out.println("Move right (X + 1)");
        }
    },

    WEST {
        @Override
        public void move() {
            System.out.println("Move left (X - 1)");
        }
    };

   public abstract void move();
}