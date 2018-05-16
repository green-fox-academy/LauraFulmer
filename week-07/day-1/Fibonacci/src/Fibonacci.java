public class Fibonacci {
    int index;

    public Fibonacci() {
    }

    public Fibonacci(int index) {
        this.index = index;
    }

    public int fibonacciMemberCounter(int memberIndex) {
        if ( memberIndex == 1) {
            return 0;
        } else if (memberIndex == 2 || memberIndex == 3) {
            return 1;
        } else {
                int fibonacci1 = 1;
                int fibonacci2 = 1;
                int fibonacci = 1;
                for (int i = 4; i <= memberIndex; i++) {
                    fibonacci = fibonacci1 + fibonacci2;
                    fibonacci1 = fibonacci2;
                    fibonacci2 = fibonacci;
                }
            return fibonacci;

        }
    }
}
