//Manhattan Distance between points x and y
public class ManhattanDistance {
    public static double manhattanDistance(double x1, double y1, double x2, double y2) {
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
    
    public static void main(String[] args) {
        double manhattan = manhattanDistance(0,0,10,10);
        System.out.print(manhattan);
    }
}