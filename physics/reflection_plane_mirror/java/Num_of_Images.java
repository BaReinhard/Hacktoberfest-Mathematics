public class Num_of_Images{
    /**
     *given angle between two Inclined Plane Mirrors.
     *@param A angle in degree.
     *return the number of Images formed.
     */
     public static double calculate(A){
          double res = 360/A - 1;
          if(A==0){
              System.out.println("Infinitely number of Images formed.");
              return -1;
          }
          else 
          return res;
     }
  }
