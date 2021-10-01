package algebra.addition.java;

/**
 * Add
 */
public class Add {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.add(15, 14));
    }

    private int add(int a, int b) {
        return a + b;
    }
}