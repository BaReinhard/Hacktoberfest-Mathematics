import java.util.Scanner;

public class DerivativePolynomial {
 
 
public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter the degree : ");
  
  int degree = sc.nextInt();
  
  System.out.println("Enter the " + (degree+1) + " coefficients " );
  
  int[] coeff = new int[degree+1];
  
  for (int i = 0; i < coeff.length; i++) {
   coeff[i] = sc.nextInt();
  }
  
  int[] derivativeCoeff = new int[degree] ;  
  
  for (int i = 0; i < derivativeCoeff.length;  i++) {
   derivativeCoeff[i] = coeff[i]*(degree - i);
  }
  
  for (int i = 0; i < derivativeCoeff.length; i++) {
   System.out.print(derivativeCoeff[i] + "*x^" + (degree - i) );
   if(i != derivativeCoeff.length-1 && derivativeCoeff[i+1] > 0  ) {
    System.out.print("+");
   }
  }
  
 }

}