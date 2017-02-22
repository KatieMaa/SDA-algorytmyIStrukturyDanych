package algorytmy.fibonacci;

/**
 * Created by RENT on 2017-02-22.
 */
public class FibonacciRecursice implements Fibonacci{

    @Override
    public long getN(int n) {
        if(n==0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }else {
            return getN(n - 1) + getN(n - 2);
        }
    }
}
