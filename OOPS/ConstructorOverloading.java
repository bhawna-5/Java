class Rectangle {
    private int length;
    private int width;

    // Constructor with no parameters
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Constructor with one parameter (for square)
    public Rectangle(int side) {
        length = side;
        width = side;
    }

    // Constructor with two parameters (for rectangle)
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public int calculateArea() {
        return length * width;
    }


}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(5); // Creating a square
        System.out.println("Area of the square: " + square.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6); // Creating a rectangle
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }
}
