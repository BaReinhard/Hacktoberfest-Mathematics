// Author: Brett Reinhard
import java.rmi.server.ExportException;
import java.util.*;
class Mathematics {
    public static long factorial(long number){
        if(number ==1 ){
            return 1;
        }else{
            return number * factorial(number-1);
        }
    }

}
class factorial_recursive
{
	public static void main(String args[])
	{
		Mathematics m=new Mathematics();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long  n=sc.nextInt();
		long fact=m.factorial(n);
		System.out.println("Factorial of a given no = "+ fact);
	}
}
