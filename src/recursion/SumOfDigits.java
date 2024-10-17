package recursion;

public class SumOfDigits {

    public static int findSumOfDigits(int input) {
        if (input < 10 && input > 0) {
            return input;
        }
        if (input < 0) {
            return -1;
        }
        return input % 10 + findSumOfDigits(input / 10);
    }

    public static void main(String[] args) {
        System.out.println("Sum of Digits");
        int input = 26;
        System.out.println("The sum of input digits " + input + " is " + findSumOfDigits(input));
    }
}
