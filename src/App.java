
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
        System.out.println("Hello, World!");
    }
}
