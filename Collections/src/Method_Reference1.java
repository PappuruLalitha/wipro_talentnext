interface FactorialFunction {
    int compute(int n);
}
class MathOperations {
    public int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
public class Method_Reference1 {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        FactorialFunction func = obj::factorial;
        int result = func.compute(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
