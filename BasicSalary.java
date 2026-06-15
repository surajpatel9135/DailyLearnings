/*
-- Assume a suitable value for Ramesh's basic salary. His  dearness allowance is 40% of basic salary, and 
   house rent allowance is 20% of basic salary. write a java program to calculate his gross salary.

*/
import java.util.*;
public class BasicSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        double basicSalary = sc.nextInt();

        double dearnessAllowance = 0.40 * basicSalary;
        double houseRentAllowance = 0.20 * basicSalary;
        double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;

        System.out.println("=========================================");
        System.out.println("       RAMESH'S SALARY BREAKDOWN         ");
        System.out.println("=========================================");
        System.out.printf("Basic Salary          : Rs. %.2f\n", basicSalary);
        System.out.printf("Dearness Allowance    : Rs. %.2f\n", dearnessAllowance);
        System.out.printf("House Rent Allowance  : Rs. %.2f\n", houseRentAllowance);
        System.out.println("-----------------------------------------");
        System.out.printf("GROSS SALARY          : Rs. %.2f\n", grossSalary);
        System.out.println("=========================================");
    }
}