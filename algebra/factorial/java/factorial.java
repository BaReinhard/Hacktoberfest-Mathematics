/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.factorialmethod;

/**
 *
 * @author Lucas
 */
public class factorial {
    
    public static void main(String[] args) {
        int result = factorial(6);
        int result2 = factorial(0);
        System.out.println(result);
        System.out.println(result2);
    }
    
    public static int factorial(int n){
        int product = 1;
        
        if (n == 0){
            product = 1;
        } else{
        
        for (int i = 1; i <= n; i++ ){
           product = product*i;
        }
        
        }
        
        return product;
    }
    
}
