/*print the factorial of a large number 
 number < 254*/
import java.util.*;

public class largeFactorial
{
	 public static int multiply(int x, int res[], int res_size)
	{
    	int carry = 0;  
 
    	for (int i=0; i<res_size; i++)
    	{
        	int prod = res[i] * x + carry;
        	res[i] = prod % 10;  
        	carry  = prod/10;  
    	}
 
    	while (carry != 0)
    	{
        	res[res_size] = carry%10;
        	carry = carry/10;
        	res_size++;
    	}
    	
    	return res_size;
	}
	
	public static void factorial(int n)
	{
		int res[] = new int[500];
 		res[0] = 1;
    	int res_size = 1;
 		int i;
 		for (i=2; i<= n; i++)
        res_size = multiply(i, res, res_size);
 
    	System.out.println("Factorial of given number is :");
    	for (i=res_size-1; i>=0; i--)
        	System.out.print(res[i]);
	}
	
	public largeFactorial(int n)
	{
		factorial(n);
	}	
		
	public largeFactorial()
	{}
	
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		factorial(a);
	}
}
