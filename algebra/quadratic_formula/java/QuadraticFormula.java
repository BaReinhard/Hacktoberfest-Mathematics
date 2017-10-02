public class QuadraticFormula {

    public static Pair<ComplexNumber, ComplexNumber> quadraticFormula(ComplexNumber a, ComplexNumber b, ComplexNumber c){
        ComplexNumber determinant = b.mul(b).minus(a.mul(c).mul(4));

        ComplexNumber root1;
        ComplexNumber root2;
        ComplexNumber rootDeterminant = determinant.root();
        root1 = ComplexNumber.addAll(b.div(a.mul(2.0)).mul(-1),  rootDeterminant.div(a.mul(2.0)));
        root2 = ComplexNumber.addAll(b.div(a.mul(2.0)).mul(-1), rootDeterminant.div(a.mul(-2.0)));
        return new Pair<>(root1, root2);
    }

    static class ComplexNumber extends Pair<Double, Double>{

        ComplexNumber(Double real, Double complex) {
            super(real, complex);
        }

        public Double getRealPart() {
            return getLeft();
        }

        public Double getComplexPart() {
            return getRight();
        }

        public boolean hasImaginaryUnit() {
            return !getComplexPart().equals(0.0d);
        }

        @Override
        public String toString() {
            return getRealPart() + " " +
                    ((hasImaginaryUnit() && getComplexPart() < 0.0) ? "-i" + -getComplexPart() : "+i" + getComplexPart());
        }

        public ComplexNumber add(ComplexNumber number) {
            return new ComplexNumber(this.getRealPart() + number.getRealPart(),
                    number.getRealPart() + number.getComplexPart());
        }

        public ComplexNumber add(double number) {
            return this.add(new ComplexNumber(number, 0.0d));
        }

        public ComplexNumber minus(ComplexNumber number) {
            return this.add(number.mul(-1));
        }

        public ComplexNumber minus(double number) {
            return this.minus(new ComplexNumber(number, 0.0d));
        }

        public ComplexNumber mul(ComplexNumber number) {
            double x = this.getRealPart();
            double y = this.getComplexPart();
            double a = number.getRealPart();
            double b = number.getComplexPart();

            return new ComplexNumber(x*a - y*b,x*b + a*y);
        }

        public ComplexNumber mul(double number) {
            return new ComplexNumber(this.getRealPart() * number,this.getComplexPart()*number);
        }

        public ComplexNumber div(ComplexNumber number) {
            double divisor = (number.getRealPart() * number.getRealPart() + number.getComplexPart() * number.getComplexPart());
            return this.mul(number.conjugate()).div(divisor);
        }

        public ComplexNumber div(double number) {
            return new ComplexNumber(this.getRealPart() / number, this.getComplexPart() / number);
        }

        public ComplexNumber conjugate() {
            return new ComplexNumber(getRealPart(), getComplexPart() * -1);
        }

        public ComplexNumber root() {
            if (!hasImaginaryUnit())
                return new ComplexNumber(Math.sqrt(getRealPart()), 0.0);

            double t = Math.sqrt((Math.abs(getRealPart()) + abs()) / 2.0);
            if (getRealPart() >= 0.0) {
                return new ComplexNumber(t, getComplexPart() / (2.0 * t));
            } else {
                return new ComplexNumber(Math.abs(getComplexPart()) / (2.0 * t),
                        Math.copySign(1d, getComplexPart()) * t);
            }
        }

        public double abs() {
            double real = getRealPart();
            double imaginary = getComplexPart();
            if (Math.abs(real) < Math.abs(imaginary)) {
                if (imaginary == 0.0) {
                    return Math.abs(real);
                }
                double q = real / imaginary;
                return Math.abs(imaginary) * Math.sqrt(1 + q * q);
            } else {
                if (real == 0.0) {
                    return Math.abs(imaginary);
                }
                double q = imaginary / real;
                return Math.abs(real) * Math.sqrt(1 + q * q);
            }
        }

        public static ComplexNumber addAll(ComplexNumber... numbers) {
            double realPart = 0.0d;
            double complexPart = 0.0d;

            for (ComplexNumber number : numbers) {
                realPart += number.getRealPart();
                complexPart += number.getComplexPart();
            }
            return new ComplexNumber(realPart, complexPart);
        }
    }

    // Need mutable Pair
    static class Pair<L, R> {

        private L left;
        private R right;

        Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }

        public L getLeft() {
            return left;
        }

        public R getRight() {
            return right;
        }

        @Override
        public String toString() {
            return left + ", " + right;
        }
    }

    public static void main(String[] args) {
        System.out.println(quadraticFormula(new ComplexNumber(0.0, 1.0),
                new ComplexNumber(1.0, 0.0), new ComplexNumber(2.0, 0.0)));
    }
}
