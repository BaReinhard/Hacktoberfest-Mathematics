public class SumOfFirstNNumbers {
    public static long sum(int n) {
        return (n * (n + 1)) / 2;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the value of n :");
    int n=sc.nextInt();
    System.out.println("Sum of first "+n+" numbers is "+sum(n));
}
}
