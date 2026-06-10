import java.util.*;

public class CheckAdult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}