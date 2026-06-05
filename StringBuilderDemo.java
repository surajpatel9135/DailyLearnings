import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values: ");
        StringBuilder s = new StringBuilder(sc.nextLine());

        while (s.length() > 0) {
            char ch = s.charAt(s.length() - 1);
            System.out.println("Removed: " + ch);
            s.deleteCharAt(s.length() - 1);
        }
        System.out.println("StringBuilder is empty");
    }
}