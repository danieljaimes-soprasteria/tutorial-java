package capitulo6.lambdas;

import java.util.function.Predicate;

public class Lambdas {
    public static void main(String args[]) {
        Predicate<Integer> isPar = num -> (num%2 == 0);
        System.out.println("Result: " + isPar.test(4));
        System.out.println("Result: " + isPar.test(5));
    }
}
