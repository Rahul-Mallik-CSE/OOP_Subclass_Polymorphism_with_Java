
//subclass polymorphism example

class Animal {
    String color;
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Bird extends Animal {
    String type;
    void eat() {
        System.out.println("Bird is eating seeds");
    }
}

class Horse extends Animal {
    String breed;
    void eat() {
        System.out.println("Horse is eating hay");
    }
    void sleep() {
        System.out.println("Horse is sleeping");
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Subclass Polymorphism Example: ");
        Animal a = new Animal();
        Animal b = new Bird();
        Animal h = new Horse();
        a.eat(); // Animal is eating
        b.eat(); // Bird is eating seeds
        h.eat(); // Horse is eating hay
        // h.sleep(); // We cannot call sleep() method using Animal reference because Animal class does not have sleep() method
        //we can only call methods that are present in the Animal class

        //if we want to call sleep() method, we need to typecast h to Horse class
        if(h instanceof Horse) {
            Horse horse = (Horse) h;
        horse.sleep(); // Horse is sleeping

        }
    }
}
