package shape;

public class Square extends Shape {
    private final double sideLength;
    private final int Id;

    public Square(double sideLength){
        this.Id = getId();
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square (ID# " + Id + ")" + "\nSide Length = " + sideLength + "\nArea = " + area() + "\nPerimeter = " + perimeter() + "\n";
    }

    @Override
    public double area(){
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return sideLength * 4;
    }

    public double getSideLength(){
        return sideLength;
    }

    public void setSideLength(double aSideLength){
        aSideLength = sideLength;
    }
}
