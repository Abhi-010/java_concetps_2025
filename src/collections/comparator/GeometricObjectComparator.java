package collections.comparator;

import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject> {
    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        if(o1.area() > o2.area()){
            return 1;
        }
        else if(o1.area() < o2.area()){
            return -1;
        }
        return 0;
    }
}
