public class UseOfStringArgs {
    public static void main (String[] args) {
        System.out.println("Number of Arguments are: "+args.length);

        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument "+ i +" = "+args[i]);
        }
    }
}

// output:- 
// Number of Arguments are: 3
// Argument 0 = suraj
// Argument 1 = kumar
// Argument 2 = patel