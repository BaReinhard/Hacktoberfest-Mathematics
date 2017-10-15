import java.util.ArrayList;
import java.util.List;

public class GramSchmidtProcess {
    private static double vectorInnerProduct(Vector u, Vector v) {
        double inner_product = 0;

        for (int i = 0; i < u.entries.size(); i++) {
            inner_product += u.entries.get(i) * v.entries.get(i);
        }

        return inner_product;
    }

    private static Vector vectorProjection(Vector u, Vector v) {
        double constant = vectorInnerProduct(u, v) / vectorInnerProduct(u, u);

        List<Double> entries = new ArrayList<>();
        for (int i = 0; i < u.entries.size(); i++) {
            entries.add(u.entries.get(i) * constant);
        }

        return new Vector(entries);
    }

    private static boolean zero (List<Double> v) {
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) != 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Vector> gramSchmidtProcess (List<Vector> v) {
        List<Vector> u = new ArrayList<>();

        for (int i = 0; i < v.size(); i++) {
            Vector vVector = v.get(i);
            Vector uVector = new Vector(vVector.entries);

            try {
                for (int j = 0; j < i; j++) {
                    uVector.subtract(vectorProjection(u.get(j), vVector));
                }
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("All vectors should be the same size!");
                System.exit(0);
            }

            if (!zero(uVector.entries)) {
                u.add(uVector);
            }
        }

        return u;
    }

    public static void main(String[] args) {
        List<Vector> vectors = new ArrayList<>();

        List<Double> v1 = new ArrayList<>();
        v1.add(1.0);
        v1.add(0.0);
        v1.add(-1.0);

        List<Double> v2 = new ArrayList<>();
        v2.add(2.0);
        v2.add(2.0);
        v2.add(3.0);

        List<Double> v3 = new ArrayList<>();
        v3.add(1.0);
        v3.add(3.0);
        v3.add(1.0);

        vectors.add(new Vector(v1));
        vectors.add(new Vector(v2));
        vectors.add(new Vector(v3));

        for (Vector v : gramSchmidtProcess(vectors)) {
            System.out.println(v.entries.get(0) + " " + v.entries.get(1) + " " + v.entries.get(2));
        }
    }

    private static class Vector {
        private List<Double> entries;

        public Vector (List<Double> entries) {
            this.entries = entries;
        }

        private void subtract (Vector vector) {
            for (int i = 0; i < vector.entries.size(); i++) {
                entries.set(i, entries.get(i) - vector.entries.get(i));
            }
        }
    }
}
