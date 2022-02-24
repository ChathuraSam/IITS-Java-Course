public class Main {
    public static void main(String[] args) {

        System.out.println("-----CIRCLE-----");
       Circle c = new Circle(7, "red");
       System.out.println("Area of the Circle is : " + c.getArea());
       c.getColor();

        System.out.println("-----SQUARE-----");
       Square s = new Square(4, "blue");
       System.out.println("Area of the Square is : " + s.getArea());
       s.getColor();

    }
}
