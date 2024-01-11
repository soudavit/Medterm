class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);  
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Square square = new Square(5);

        System.out.println("Area of square: " + square.getArea());
        System.out.println("Perimeter of square: " + square.getPerimeter());
    }
}
