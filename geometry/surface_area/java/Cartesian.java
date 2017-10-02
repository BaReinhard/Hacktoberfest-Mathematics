import javafx.geometry.Point2D;

import java.util.HashSet;
import java.util.stream.Stream;

public class Cartesian {
    private HashSet<Point2D> points = new HashSet<>();

    public Cartesian() {
    }

    public HashSet<Point2D> getPoints() {
        return points;
    }

    public boolean addPoint(Point2D point) {
        return points.add(point);
    }

    public boolean removePoint(Point2D point) {
        return points.remove(point);
    }

    public int numberOfPoints() {
        return points.size();
    }

    public boolean isAnyPoint() {
        return !points.isEmpty();
    }

    public void cleanAreaFromPoint() {
        points.clear();
    }

    public Stream<Point2D> streamOfPoints() {
        return points.stream();
    }

}