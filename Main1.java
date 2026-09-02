import java.util.*;
public class Main1 {
    public static void main (String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        
        fun(animals);
    }
    
    public static void fun(List<? super Animal> values) {
        // writing allowed 
        values.add(new Animal());
        values.add(new Dog());
        values.add(new Cat());
        values.add(new Labrador());
        
        // reading allowed using Object
        for(Object obj : values) {
            Animal a = (Animal) obj;
            a.eat();
            a.walk();
            
            // wrong because this method not declared inside Animal class.
            // a.bark();
        }
    }
}

class Animal {
    void eat() {
        System.out.println("Animal Eating...");
    }
    
    void walk() {
        System.out.println("Animal Walking...");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog Eating...");
    }
    
    @Override
    void walk() {
        System.out.println("Dog is Walking...");
    }
    
    void bark() {
        System.out.println("Dog is Barking...");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat Eating...");
    }
    
    @Override
    void walk() {
        System.out.println("Cat is Walking...");
    }
    
}

class Labrador extends Dog {
    @Override
    void eat() {
        System.out.println("Labrador Eating...");
    }
    
    @Override
    void walk() {
        System.out.println("Labrador is Walking...");
    }
    
    void bark() {
        System.out.println("Labrador is Barking...");
    }
}