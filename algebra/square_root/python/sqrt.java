public class {
    public static void main(String[] args) {

        System.out.println(root(25));

    
    }
    public static double root(int number){

        int i= 0;
        int closestSquare;
        int diff;
        double root;
        while(true){
            if(number <  i * i){
                closestSquare = (i-1) * (i -1);
                diff = number - closestSquare;
                root = (double)(i-1) + (diff / (2 * (double)number));
                return root;
            }
            i++;
        }
    }

}