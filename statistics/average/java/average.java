public class average{
  private static double averageFunction(double[] num){
    double total = 0;
    for(int i = 0; i<num.length; i++){
      total += num[i];
    }
    return total/num.length;
  }

  public static void main(string[] args){
    double[] array = {1.0,7.4,6.3,6.4,9.4,0.9,8.4}
    System.out.println(averageFunction(array));
  }  
}
