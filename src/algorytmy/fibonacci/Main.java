package algorytmy.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-22.
 */
public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacciRecursive = new FibonacciRecursice();
        Fibonacci fibonacciIterational = new FibonacciIterational();

        List<Fibonacci> listaFib = new ArrayList<>();
        listaFib.add(fibonacciRecursive);
        listaFib.add(fibonacciIterational);

        for (Fibonacci fib : listaFib) {
            System.out.println(fib.getN(5));

        }
        System.out.println(fibonacciRecursive.getN(7));
        System.out.println(fibonacciIterational.getN(6));

    }
}
