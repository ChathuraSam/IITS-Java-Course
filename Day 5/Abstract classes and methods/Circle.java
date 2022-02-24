public class Circle extends Shape{

    int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    public void drawShape() {
        System.out.println("drawing a circle...");
    }

    // getColor() method can be inherit from parent
}
