
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


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
