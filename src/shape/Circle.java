package shape;

public class Circle extends Shape {
    private final double radius;
    private final double PI = Math.PI;
    private final int Id;

    public Circle(double radius){
        this.Id = getId();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle (ID# " + Id + ")" + "\nRadius = " + radius + "\nArea = " + area() + "\nPerimeter = " + perimeter() + "\n";
    }

    @Override
    public double area(){
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter(){
        return 2 * PI * radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double aRadius){
        aRadius = radius;
    }
}
