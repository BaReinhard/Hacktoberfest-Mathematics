// Java class for calclutating the variance of the population

/*
Input should be in the following format :
    number of elements in populatin : n
    elements : [space separeted n elements]
*/

import java.util.Scanner;
import java.lang.Math;

public class Variance{

    public static double calculateMean(int[] population, int n){

        int sum  = 0;
        for(int i : population){
            sum += i;
        }

        return (double) sum / n;
    }


    public static double calculateVariance(int [] population, int n){

        double mean = calculateMean(population,n);

        double sum = 0;
        for(int i : population){
            double temp = (double) i - mean;
            sum += Math.pow(temp,2);
        }

        return sum/n;
    }

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] population = new int[n];
        for(int i = 0;i<n;i++){
            population[i] = scanner.nextInt();
        }

        double variance = calculateVariance(population,n);
        System.out.println(variance);
    }
}
