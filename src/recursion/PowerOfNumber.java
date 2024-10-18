package recursion;

public class PowerOfNumber {

    public static int findPowerOfNumber(int number, int power) {
        if (power < 0) {
            return -1;
        }
        if (power == 1) {
            return number;
        }
        return number * findPowerOfNumber(number, power - 1);
    }

    public static void main(String[] args) {
        System.out.println(findPowerOfNumber(3, 3));
    }
}
