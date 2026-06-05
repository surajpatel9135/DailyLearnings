interface walk {
    void walk();
}

interface run {
    void run();
}

interface sleep {
    void sleep();
}

class Human implements walk, run {
    public void walk() {
        System.out.println("Human Walking....");
    }
    public void run() {
        System.out.println("Human Running....");
    }
}

class Dog implements walk, sleep {
    public void walk() {
        System.out.println("Dog Walking....");
    }
    public void sleep() {
        System.out.println("Dog Sleeping...");
    }
}

class cat implements run, sleep {
    public void run() {
        System.out.println("Cat is Running....");
    }
    public void sleep() {
        System.out.println("Cat is Sleeping...");
    }
}

public class Main {
    public static void main(String[] args) {

        Human h = new Human();
        h.walk();
        h.run();

        Dog d = new Dog();
        d.walk();
        d.sleep();

        cat c = new cat();
        c.run();
        c.sleep();
    }
}