package com.sg.factorialmethod;
public class factorial {
    public static void main(String[] args) {
        int result = factorial(6);
        int result2 = factorial(0);
        System.out.println(result);
        System.out.println(result2);
    }
    public static int factorial(int n){
        int product = 1;
        
<<<<<<< HEAD
        for (int i = 0; i <= n-1; i++ )
        {
           product = (product*(i+1));
        }
        
        return product;
    }
    
=======
        for (int i = 0; i <= n-1; i++ ){
            product = (product*(i+1));
            }
    return product;
    }    
>>>>>>> 277d5c140dd8520e7a91521edb90edb1d2d1fae9
}
