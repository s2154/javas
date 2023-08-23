package Assignment;


interface Shape {
    void draw();
}


class Circle implements Shape {
    
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Shape {
   public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

interface ShapeFactory {
    Shape createShape();
}


class CircleFactory implements ShapeFactory {
    
    public Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory implements ShapeFactory {
    
    public Shape createShape() {
        return new Rectangle();
    }
}

public class FactoryPattern{
    public static void main(String[] args) {
      
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();

        Shape circle = circleFactory.createShape();
        Shape rectangle = rectangleFactory.createShape();

        circle.draw();
        rectangle.draw();
    }
}

