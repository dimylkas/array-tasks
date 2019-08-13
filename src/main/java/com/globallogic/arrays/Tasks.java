package com.globallogic.arrays;

import java.util.Arrays;

public class Tasks {


    /*
    Increase by 2
        The sequence of integers is given. Increase by 2 each its non-negative element.
     */

    public int[] increaseBy2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] += 2;
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
        double lessThan = 2.5;
        double findValue = 0;
        boolean isFindValue = false;
        for (double d : arr) {
            if (d < lessThan) {
                findValue = d;
                isFindValue = true;
                break;
            }
        }

        if (!isFindValue) {
            System.out.println("Not Found");
        }

        return findValue;
    }

    /*
    The arithmetic mean of positive
        The sequence of real numbers is given. Find the arithmetic mean of positive numbers.
     */
    public double arithmeticalMean(double[] arr) {
        double result = 0.0;
        double sumOfValues = 0.0;
        int countValues = 0;

        for (double d : arr) {
            if (d > 0) {
                sumOfValues += d;
                countValues++;
            }
        }

        if (countValues > 0) {
            result = sumOfValues / countValues;
        }

        return result;
    }

    /*
        The sequence of integers is given. Find max int value in sequence
     */
    public int findMax(int[] arr) {
        Arrays.sort(arr);
        int maxValue = arr[arr.length - 1];
        return maxValue;
    }

    /*
    Maximum of absolute values
        The sequence of real numbers is given. Lets find their absolute values. Find the maximum value among these absolute values.
     */
    public double maxOfAbsoluteValues(double[] arr) {
        double findValue = arr[0];
        for (double d : arr) {
            if (Math.abs(findValue) < Math.abs(d)) {
                findValue = d;
            }
        }

        return findValue;
    }

    /*
    Negative elements
        The sequence of n real numbers is given. Find the sum and the number of negative elements in it.
     */
    public double negativeElementsSum(double[] arr) {
        double sumOfNegative = 0;
        for (double d : arr) {
            if (d < 0) {
                sumOfNegative += d;
            }
        }
        return sumOfNegative;
    }

    /*
    Reverse array
    Array of int is given. Return the given array in the reverse order
     */
    public int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int elI = arr.length - i - 1;
            reversedArr[i] = arr[elI];
        }
        return reversedArr;
    }
}
