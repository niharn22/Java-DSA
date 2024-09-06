class Shape {
    public void area() {
        System.out.println("Calculating Area...");
    }
}

class Triangle extends Shape { // Triangle inherits from Shape
    @Override
    public void area() {
        System.out.println("Area of Triangle = (base * height) / 2");
    }

    public void area(int l, int h) {
        System.out.println("Area of Triangle = " + (l * h) / 2);
    }
}

// Multilevel Inheritance: EquilateralTriangle inherits from Triangle
class EquilateralTriangle extends Triangle {
    @Override
    public void area() {
        System.out.println("Area of Equilateral Triangle = (side * side) * √3 / 4");
    }

    @Override
    public void area(int l, int h) {
        System.out.println("Area of Equilateral Triangle = " + (l * h) / 2);
    }
}

// Hierarchical Inheritance: Circle inherits from Shape
class Circle extends Shape {
    @Override
    public void area() {
        System.out.println("Area of Circle = π * r^2");
    }

    public void area(int r) {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

public class Oops {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color="Blue";
        // pen1.type = "Gel";

        // Pen pen2 = new Pen();
        // pen2.color="Black";
        // pen2.type = "Rollerball";

        // pen1.printColor();
        // pen2.printColor();

        // Student s1 = new Student("John",20);
        // s1.displayInfo();

        // Using the base class Shape
        Shape shape = new Shape();
        shape.area(); // Calls the base class method

        // Using the Triangle class, which inherits from Shape
        Triangle triangle = new Triangle();
        triangle.area(); // Calls the overridden area method in Triangle
        triangle.area(10, 5); // Calls the area method with parameters

        // Using the EquilateralTriangle class, which inherits from Triangle
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.area(); // Calls the overridden area method in EquilateralTriangle
        equilateralTriangle.area(10, 5); // Calls the overridden area method with parameters

        // Using the Circle class, which inherits from Shape
        Circle circle = new Circle();
        circle.area(); // Calls the overridden area method in Circle
        circle.area(7); // Calls the area method with parameters
    }
}
