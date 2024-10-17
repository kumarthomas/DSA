package recursion;

public class Fibonacci {

    //Method to find fibonacci series using recursion
    public static int fibonacci(int input) {
        //Base Case -> To stop the recursive call
        if (input == 0 || input == 1) {
            return input;
        }
        //Unintentional Case
        if (input < 0) {
            return -1;
        }
        //Recursion
        return fibonacci(input - 1) + fibonacci(input - 2);
    }

    public static void main(String... args) {
        int count = 20; // Define how many terms of Fibonacci series to print

        System.out.println("Fibonacci Series up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
