package collections.comparator;

public class Circle extends GeometricObject{
    private int radius ;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * this.radius * this.radius;
    }
}
