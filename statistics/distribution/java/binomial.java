import java.lang.Math;
import java.util.*;
public class binomial
{

  public static void main(String [] args){
    int choice = 0;
    Scanner keyboard = new Scanner(System.in);

    do{
      System.out.println("1. Binomial");
      System.out.println("2. Quit");

      System.out.print("Please Select an option: ");
      choice = keyboard.nextInt();
      switch(choice){
        case 1:
          binomial();
          break;

        default:
          System.exit(0);
      }

    }while(choice == 1);

  }

  public static void binomial(){
    Scanner keyboard = new Scanner(System.in);
    double p;
    int n;
    double cummulative_probability = 0;

    System.out.print("Please enter Probability p: ");
    p = keyboard.nextDouble();
    System.out.print("Please enter number of trials n: ");
    n = keyboard.nextInt();

    for(int i = 0; i <= n; i++){
      cummulative_probability += (choose(n, i)) * (Math.pow(p, i)) * (Math.pow((1 - p),(n - i)));
    }
    System.out.println("Binomial: " + cummulative_probability);
  }

    public static long choose(long total, long choose){
    if(total < choose)
        return 0;
    if(choose == 0 || choose == total)
        return 1;
    return choose(total-1,choose-1)+choose(total-1,choose);
}

}
