interface PrimeChecker {
    MyPrimeClass check(int n);
}
class MyPrimeClass {
    MyPrimeClass(int n) {
        if (isPrime(n))
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
public class Method_Reference3 {
    public static void main(String[] args) {
        PrimeChecker checker = MyPrimeClass::new;
        checker.check(19); 
        checker.check(32); 
    }
}
