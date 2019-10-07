import java.util.*;
class A
{
	public int add(int a,int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
}
class add
{
	public static void main(String args[])
	{
		A ob=new A();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two no.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=ob.add(a,b);
		System.out.println("Sum of two number is = "+sum);
	}
}