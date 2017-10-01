import java.util.HashSet;
import java.util.stream.Stream;

public class Cartesian {
    private HashSet<Point> points = new HashSet<>();

    public Cartesian() {
    }

    public HashSet<Point> getPoints() {
        return points;
    }

    public boolean addPoint(Point point) {
        return points.add(point);
    }

    public boolean removePoint(Point point) {
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

    public Stream<Point> streamOfPoints() {
        return points.stream();
    }

}