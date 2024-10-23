package arrays;

import java.util.Arrays;

public class ArrayFunctions {
    int[] array;

    public ArrayFunctions(int sizeOfArray) {
        array = new int[sizeOfArray];
        //Filling the array with default value for array manipulations
        Arrays.fill(array, Integer.MIN_VALUE);
    }

    //Method to insert values into array
    public void insert(int index, int value) {
        try {
            if (array[index] == Integer.MIN_VALUE) {
                array[index] = value;
                System.out.println("Value " + value + " inserted at index [" + index + "] successfully");
            } else {
                System.out.println("The index [" + index + "] already has a value");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid index [" + index + "]");
        }
    }

    public void findValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Value " + value + " found at index [" + i + "]");
                return;
            }
        }
        System.out.println("The value " + value + " not found");
    }

    public static void main(String[] args) {
        ArrayFunctions af = new ArrayFunctions(3);
        af.insert(0, 1);
        af.insert(1, 2);
        af.insert(1, 1);
        af.insert(5, 1);
        af.findValue(1);
    }
}
