import java.util.Scanner;
class VectorDotProduct
{ //opening a class
public static void main(String[] args)
{ //opening a method
     Scanner s=new Scanner(System.in); // declaring the name of the scanner object
     System.out.println("Enter the dimension of the first vector"); 
     int n=s.nextInt(); //storing the value of dimension of first vector entered by the user
     System.out.println("Enter the dimension of second vector");
     int m=s.nextInt(); //storing the value of dimension of second vector entered by the user
     int dp=0; //storing the dot product of two vectors 
     if(n==m) //will compute dot product if both dimensions are equal
        {
          double[] a=new double[n]; //creating an array to store the co-ordinates of the first vector
          for(int i=0;i<n;i++)
            {
              System.out.println("Enter the "+i+"th co-ordinate of the vector 1");
              double x=s.nextDouble(); //storing the value of the co-ordinate entered by the user
              a[i]=x; //storing the value of the co-ordinate in the array
             }
          double[] b=new double[m]; //creating an array to store the co-ordinates of the ssecond vector
          for(int i=0;i<m;i++)
            { 
              System.out.println("Enter the "+i+"th co-ordinate of vector 2");
              double y=s.nextDouble(); //storing the value of the co-ordinate entered by the user     	
              b[i]=y; //storing the value of the co-ordinate in the array
            }
          double[] c=new double[n]; //creating an array to store the product of the co-ordinates
          for(int i=0;i<n;i++)
            {
              c[i]=a[i]*b[i]; //storing the value of the co-ordinate in the array
            }
          for(int i=0;i<n;i++)
            {
              dp=dp+c[i];// finding the dot product and storinng its value
            }
          System.out.println("The dot product of two vectors is"+dp);
        }
     else System.out.println(" finding dot product is not possible because the dimensions of both vectors are different")
} //closing the method
} //closing the class