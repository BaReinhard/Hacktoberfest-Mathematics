import java.util.*;
class Complex
{
	private float real;
	private float img;

	public Complex(int real,int img)
	{
		this.real=real;
		this.img=img;
	}

	public Complex mulComplex(Complex c1new)
	{
		Complex temp=new Complex(0,0);
		temp.real=(this.real*c1new.real)-(this.img*c1new.img);
		temp.img=(this.real*c1new.img)+(this.img*c1new.real);
		return temp;
	}

	public Complex divComplex(Complex c1new)
	{
		Complex temp=new Complex(0,0);
		float deno=(float)(Math.pow(c1new.real,2)+Math.pow(c1new.img,2));
		temp.real=((this.real*c1new.real)+(this.img*c1new.img))/deno;
		temp.img=((this.real*c1new.img)-(this.img*c1new.real))/deno;
		return temp;
	}

	public Complex addComplex(Complex c1new)
	{
		Complex temp=new Complex(0,0);
		temp.real=c1new.real+this.real;
		temp.img=c1new.img+this.img;
		return temp;
	}

	public void display()
	{
		System.out.println(this.real+" + "+this.img+"i");
	}
}

public class ComplexNumber
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two complex number: ");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		sc.nextLine();
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		sc.nextLine();

		Complex c1=new Complex(a1,b1);
		Complex c2=new Complex(a2,b2);

		Complex ca=c1.addComplex(c2);
		Complex cm=c1.mulComplex(c2);
		Complex cd=c1.divComplex(c2);

		System.out.print("\nAddition : ");
		ca.display();
		System.out.print("\nMultiplication : ");
		cm.display();
		System.out.print("\nDivision : ");
		cd.display();
	}
}