/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class remainder
{
    public static void main(String args[])
    {
        int rem = findRemainder();
        System.out.println("The remainder is "+ rem);
    }

    static int findRemainder()
    {
        //take input from the user
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int q = a/b;
            System.out.println("Just making sure b is non-zero");
        }
        catch (Exception e)
        { System.out.println(e);
        }

        int q =a/b;
        int rem1 = a - b*q;
        return rem1;

    }

}