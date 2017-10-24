public class Num_of_common_tangents{
  /*
  *find the number of common tangent passes if radius of two circle are given .
  *@param d distance between centre of two circle.
  *@param r1 radius of first circle.
  *@param r2 radius of second circle.
  *return the number of common tangents passes throught the circle.
  */
  
  public static int  num_of_common_tangents(double d , double r1 , double r2){
        if((r1 +r2)==d){
            return 3;
        }else if((r1+r2)>=d){
            return 4;
         }
         else{
            return 2;
         }
    }
  }
