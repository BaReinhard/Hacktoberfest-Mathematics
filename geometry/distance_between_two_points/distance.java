import java.util.Scanner;
public class Distance
{
public static void (String[]args)
{
double x1,x2,y1,y2;
Scanner ler=new Scanner(System.in);
System.out.println("X1:");
x1=ler.nextDouble();
System.out.println("y1:");
y1=ler.nextDouble();
System.out.println("X2:");
x2=ler.nextDouble();
System.out.println("y2:");
y2=ler.nextDouble();
double s=Math.pow((x1-x2),2);
double z=Math.pow((y1-y2),2);
double ss=s+z;
System.out.println("Distance: " + Math.pow(ss,0.5));

}

}

