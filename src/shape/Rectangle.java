package shape;

public class Rectangle extends Shape {
    private final double length;
    private final double width;
    private final int Id;

    public Rectangle(double length, double width) {
        this.Id = getId();
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle (ID# " + Id + ")" + "\nLength = " + length + "\nWidth = " + width + "\nArea = " + area() + "\nPerimeter = " + perimeter() + "\n";
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double aLength){
        aLength = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double aWidth){
        aWidth = width;
    }
}
