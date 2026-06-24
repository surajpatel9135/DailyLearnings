/*
# abstraction:-
-- Hide implementation details and shows only essential data.
-- abstraction achived by interfaces and inheritence.
-- abstract class can not instantiate.
-- if we declare an abstract method inside any class then we have to make this class as abstract. cause abstract method declare inside an abstract class.
-- if we make the class as abstract then we need to initialize the method in its child class.
-- without initialize it we can get an error.

*/


public class Abstracttion
{
	public static void main(String[] args) {
		Car car = new FuelCar();
		car.start();
		car.accelerate();
		car.Break();
	}
}

abstract class Car {
    void start() {
        System.out.println("Car is started..");
    }
    abstract void accelerate();
    abstract void Break();
}

class FuelCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Car is accelerating at 10km/h");
    }
    
    @Override
    void Break() {
        System.out.println("Car is stopping");
    }
}

class ElectricCar extends Car {
    @Override
    void accelerate() {
         System.out.println("Car is accelerating at 10km/h");
    }
    
    @Override
    void Break() {
        System.out.println("Car is stopping");
    }
}



