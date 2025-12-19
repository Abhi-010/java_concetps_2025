package collections.comparator;

public class Rectangle extends GeometricObject{
    private int length;
    private int breath;
    Rectangle(int length, int breath){
        this.breath = breath;
        this.length = length;
    }
    @Override
    public double area() {
        return length*breath;
    }
}
