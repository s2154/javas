package Assignment;

interface Flying {
    void fly();
}


class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}


class Bird extends Animal implements Flying {
   
    public void fly() {
        System.out.println("Bird is flying.");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Sparrow extends Bird {
    void chirp() {
        System.out.println("Sparrow is chirping.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Dog dog = new Dog();

        sparrow.eat();  
        sparrow.fly();  
        sparrow.chirp(); 
        System.out.println();

        dog.eat();  
        dog.bark(); 
    }
}
