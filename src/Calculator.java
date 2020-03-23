public class Calculator {
    private double a;
    private double b;
    char operator;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public static double sum(double a, double b) {
        return Double.sum(a, b);
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        if (a == 0 || b == 0) {
            String zeroValue;
            if(a == 0){
                zeroValue = "a";
            } else {
                zeroValue = "b";
            }
            System.out.println("not permitted because of value: " + zeroValue);
        } else {
            return a * b;
        }
    }

    public static double division(double a, double b) {
        return a / b;
    }

}
