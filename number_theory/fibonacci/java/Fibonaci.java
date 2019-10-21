
public class Fibonaci{

  public void fibonaci(int n){

    int i =1, j=2;
    int temp = 0;
    System.out.println(i + "");
    System.out.println(j + "");
    while(i <= n){
      temp = i + j;
      System.out.println(temp + "");
      i = j;
      j = temp;
    }
  }

  public static void main(String[] args) {
    Fibonaci fibonaci = new Fibonaci();
    fibonaci.fibonaci(10);
  }
}