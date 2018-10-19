import com.sun.javafx.geom.Line2D;
import javafx.geometry.Point2D;

import java.util.HashSet;
import java.util.stream.Stream;

public class Cartesian {
    public final Points points;
    public final Lines lines;

    public Cartesian() {
        points = new Points();
        lines = new Lines();
    }

    private class Points {
        private HashSet<Point2D> points = new HashSet<>();

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

    private class Lines {
        private HashSet<Line2D> lines = new HashSet<>();

        public HashSet<Line2D> getLines() {
            return lines;
        }

        public boolean addLine(Line2D line2D) {
            return lines.add(line2D);
        }
        
        public boolean removeLine(Line2D line2D) {
            return lines.remove(line2D);
        }

        public int numberOfLines() {
            return lines.size();
        }

        public boolean isAnyLine() {
            return !lines.isEmpty();
        }

        public void cleanAreaFromLines() {
            lines.clear();
        }

        public Stream<Line2D> streamOfLines() {
            return lines.stream();
        }
    }
}
