// For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
// with a being the initial term and d being the common difference

public class arithmetic_progression {

  // This function calculates the nth term
    public static int nth_term(int a, int d, int n) {
        return a + (n - 1) * d;
    }

}
