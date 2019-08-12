package com.globallogic.arrays;

public class Tasks {


    /*
    Increase by 2
        The sequence of integers is given. Increase by 2 each its non-negative element.
     */
    public int[] increaseBy2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = arr[i] + 2;
            }
        }
        return arr;
    }

    /*
    The first is not greater for 2,5
        Array of real numbers is given. Find the first element in array which value does not exceed 2.5.
        In the case of absence the specified element print "Not Found"
    */
    public double findFirstNumber(double[] arr) {
        for (double value : arr) {
            if (value < 2.5) {
                return value;
            }
        }
        System.out.println("Not found");
        return 0;
    }

    /*
    The arithmetic mean of positive
        The sequence of real numbers is given. Find the arithmetic mean of positive numbers.
     */
    public double arithmeticalMean(double[] arr) {
        double positiveNumbersSum = 0;
        int positiveNumbersCounter = 0;
        for (double element : arr) {
            if (element > 0) {
                positiveNumbersSum += element;
                positiveNumbersCounter++;
            }
        }
        if (positiveNumbersCounter != 0) {
            return positiveNumbersSum / positiveNumbersCounter;
        }
        return 0;
    }

    /*
        The sequence of integers is given. Find max int value in sequence
     */
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int element : arr) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    /*
    Maximum of absolute values
        The sequence of real numbers is given. Lets find their absolute values. Find the maximum value among these absolute values.
     */
    public double maxOfAbsoluteValues(double[] arr) {
        double max = arr[0];
        for (double element : arr) {
            if (Math.abs(element) > Math.abs(max)) {
                max = element;
            }
        }
        return max;
    }

    /*
    Negative elements
        The sequence of n real numbers is given. Find the sum and the number of negative elements in it.
     */
    public double negativeElementsSum(double[] arr) {
        double sum = 0;
        for (double element : arr) {
            if (element < 0) {
                sum += element;
            }
        }
        return sum;
    }

    /*
    Reverse array
    Array of int is given. Return the given array in the reverse order
     */
    public int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}
