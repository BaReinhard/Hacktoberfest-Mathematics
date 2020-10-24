import java.util.*;
class AreaTriangle {
    
    double HeronsFormula(double side1, double side2, double side3) {
        double perimeter = (side1+side2+side3)/2;
        double ans = Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
        return ans;
    }
    public static void main(String[] args) {
        
        AreaTriangle at = new AreaTriangle();
        Scanner scan = new Scanner(System.in);
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double side3 = scan.nextDouble();
        double result = at.HeronsFormula(side1, side2, side3);
        System.out.println("Are of triangle is: "+result);
        scan.close();
    }
}