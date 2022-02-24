public class Square extends Shape{

    int sideLength;

    public Square(int sideLength, String color) {
        super(color);
        this.sideLength = sideLength;
    }

    public double getArea() {
        double area = this.sideLength * this.sideLength;
        return area;
    }

    public void drawShape() {
        System.out.println("Square is drawing...");
    }

    // getColor() method can be inherit from parent
}
