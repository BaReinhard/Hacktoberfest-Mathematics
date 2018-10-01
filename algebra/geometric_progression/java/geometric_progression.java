// For a geometric progression a + ar + ar^2 + ar^3 + ...
// with a being the scale factor and r being the common ratio


public class geometric_progression {

    // This function calculates the nth term.
    public static int nth_term(int a, int r, int n) {
        return a * ((int) Math.pow(r, n - 1));
    }

    //This function calculates sum of first n terms 
    public static int sum_of_first_n_tems(int a, int r, int n) {
        if (r == 1) {
            return a * n;
        } else {
            return a * ((int) Math.pow(r, n) - 1) / (r - 1);
        }
    }

}
