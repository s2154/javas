package Assignment;

interface Flyable {
    void fly();
}


interface Swimmable {
    void swim();
}


class FlyingFish implements Flyable, Swimmable {
   
    public void fly() {
        System.out.println("FlyingFish is flying.");
    }

   
    public void swim() {
        System.out.println("FlyingFish is swimming.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        FlyingFish flyingFish = new FlyingFish();
        flyingFish.fly();
        flyingFish.swim();
    }
}


