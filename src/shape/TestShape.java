package shape;

public class TestShape {
    public static void main(String[]args) {
        Shape square = new Square(2);
        System.out.println(square);

        Shape rectangle = new Rectangle(4, 8);
        System.out.println(rectangle);

        Shape circle = new Circle(8);
        System.out.println(circle);
    }
}
