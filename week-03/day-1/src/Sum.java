public class Sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

   int parameter = 5;
   System.out.println(sum(parameter));
    }

    public static int sum(int numbers) {
        int var = 0;
        for (int i = 1; i <= numbers; i++) {
            var += i;
        }
        return var;
    }
}
