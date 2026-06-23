/*
# Encapsulation:-
-- Encapsulation wraps data and behaviours (methods) in a single unit.
-- means when write code at that time we create some variable and methods in same class that is known as Ecapsulation.
-- Encapsulation provides security using access modifiers.
-- bith data & methods should be together(Encapsulated) within an class.
-- we should not provide unrestricted access of our data.

# Access Modifier:-
-- access modifier helps to protect our data from unauthorized access.
-- these are 4.
1. private access modifier
-- private access modifier is help to protect our data from unauthorized, direct access.
-- it cannot apply on root class.
-- it only apply on only subclasses, variables, methods, and constructors.
Ex:- private double balance;
-- this balance can only accessible in that class, we can't access it from outside this class.

2. default access modifier
-- default access modifier can only accessible in same package.
-- it is a default access modifier.

3. protected access modifier
-- protected can only accessed by same package or inherited class (child class).
-- protected can't apply on main class.

4. public access modifier
-- public access modifier is unrestricted access modifier.
-- Anyone can access it.

most restricted        ------------->        not restricted
private  ----> default -----> protected -----> public


# Package:-
A package is groups of similar classes.

*/

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(-123444);
        ba.withdraw(400);
        System.out.println(ba.getbalance());
    }
}

class BankAccount {
    private double balance;

    public void deposit(int amount) {
        // this is validation
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successfully..");
        } else
            System.out.println("Deposit Failed..");
    }

    public void withdraw(int amount) {
        // this is validation
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw balance Successfully..");
        } else {
            System.out.println("Withdraw Failed..");
        }
    }

    // get balance 
    public double getbalance() {
        return balance;
    }
}