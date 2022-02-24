public abstract class Shape {
    String color;

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    // abstract methods
    public abstract double getArea();
    public abstract void drawShape();

    // non abstract methods
    public void getColor() {
        System.out.println("My Shape color is : " + this.color);
    }

}
