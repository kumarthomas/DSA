package recursion;

public class GCD {
    //Method to find the Great Common Divisor of a number
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 26;
        int num2 = 26;
        System.out.println(findGCD(num1, num2));
    }
}
