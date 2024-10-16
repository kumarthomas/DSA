package recursion;

public class Factorial {

    //Method to find factorial by recursion
    public int findFactorial(int input) {
        if (input == 1) {
            return 1;
        }
        if (input < 1) {
            return -1;
        }
        return input * findFactorial(input - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.findFactorial(1));
    }
}
