import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number- ");
        double a = in.nextDouble();
        calc.setA(a);
        System.out.print("Enter second number- ");
        double b = in.nextDouble();
        calc.setB(b);
        System.out.print("Enter the operation (+ - / *) - ");
        char scannerOperator = in.next().charAt(0);
        calc.operator = scannerOperator;


        switch(calc.operator){
            case '+': {
                double result = calc.sum(calc.getA(), calc.getB());
                System.out.println("Result: " + result);
                break;
            }
            case '-': {
                double result = calc.subtract(calc.getA(), calc.getB());
                System.out.println("Result: " + result);
                break;
            }
            case '*': {
                double result = calc.multiply(calc.getA(), calc.getB());
                System.out.println("Result: " + result);
                break;
            }
            case '/': {
                double result = calc.division(calc.getA(), calc.getB());
                System.out.println("Result: " + result);
                break;
            }
        }
    }

}
