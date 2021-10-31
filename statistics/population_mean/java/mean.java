// Java class for calclutating the mean of the population

/*
Input should be in the following format :
    number of elements in populatin : n
    elements : [space separeted n elements]
*/

import java.util.Scanner;

public class Mean{

    public static double calculateMean(int[] population, int n){

        int sum  = 0;
        for(int i : population){
            sum += i;
        }

        return (double) sum / n;
    }

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] population = new int[n];
        for(int i = 0;i<n;i++){
            population[i] = scanner.nextInt();
        }

        double mean = calculateMean(population,n);
        System.out.println(mean);
    }
}
