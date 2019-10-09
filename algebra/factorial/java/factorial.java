package com.sg.factorialmethod;
public class factorial {
    public static void main(String[] args) {
        factorial(6);
        factorial(0);
    }
    public static void factorial(int n){
        int answer = 1;
        for (int i=0; i<n; i++){answer*=(i+1);}
        System.out.println("Factorial of "+n+" is : "+answer);
    return;
    }    
}
