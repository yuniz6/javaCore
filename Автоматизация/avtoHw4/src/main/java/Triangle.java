public class Triangle {
    public double someMethod(int a, int b, int c) throws MyException {

        if (a < 0 || b < 0 || c < 0 || a > 50 || b > 50 || c > 50) throw new MyException("It's not a triangle");

        int p = ((a + b + c) / 2);

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}



