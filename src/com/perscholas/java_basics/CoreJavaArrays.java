package com.perscholas.java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class CoreJavaArrays {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int operation;
        do {
            System.out.println("\n---------------------------------------------");
            System.out.println("1. Simple array creation");
            System.out.println("2. Returns the middle element in an array");
            System.out.println("3. Cloning String array");
            System.out.println("4. Array out of bound example");
            System.out.println("5. Loop through array and assign value of loop control variable to corresponding index in array");
            System.out.println("6. Loop through array and assign value of loop control variable multiplied by 2 to corresponding index in array");
            System.out.println("7. Loop through array and print value of each element, except for middle element");
            System.out.println("8. Creates String array of 5 elements and swaps first element with middle element without creating new array");
            System.out.println("9. Sort array in ascending order and print smallest and largest element");
            System.out.println("10. Create an array that includes an integer, 3 strings, and 1 double");
            System.out.println("11. Exit");
            System.out.println("Please select one of the operation to perform : ");
            operation = input.nextInt();
            switch (operation) {
                case 1:
                    simpleArrayCreation();
                    break;
                case 2:
                    returnMidEleOfArray();
                    break;
                case 3:
                    cloneStrArray();
                    break;
                case 4:
                    arrayOutOfBoundExample();
                    break;
                case 5:
                    loopingThroughArray();
                    break;
                case 6:
                    loopThroughArrAndValAssignment();
                    break;
                case 7:
                    loopThroughArrAndPrintVal();
                    break;
                case 8:
                    swapFirstEleWithMidElement();
                    break;
                case 9:
                    sortArray();
                    break;
                case 10:
                    createMultipleDataTypeArray();
                    break;
                case 11:
                    break;
                default:
                    System.out.println("ERROR : Please select valid operation");
            }
        } while (operation != 11);
    }

    /*Write a program that creates an array of integers with a length of 3.
    Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/
    private static void simpleArrayCreation() {
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    /*Write a program that returns the middle element in an array.
    Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7*/
    private static void returnMidEleOfArray() {
        int[] numArray = new int[5];
        System.out.println("Please enter 5 numbers : ");
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            numArray[i] = input.nextInt();
            i++;
        }
        System.out.println("Middle element in array : " + numArray[numArray.length / 2]);
    }

    /*Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
    Print out the array length. Make a copy using the clone( ) method.
    Use the Arrays.toString( ) method on the new array to verify that the original array was copied.*/
    private static void cloneStrArray() {
        String[] color = {"red", "green", "blue", "yellow"};
        System.out.println("Color array : " + Arrays.toString(color));
        System.out.println("Length of the color array is " + color.length);
        String[] newColorArray = color.clone();
        System.out.println("New color array : " + Arrays.toString(newColorArray));
    }

    /*Write a program that creates an integer array with 5 elements (i.e., numbers).
    The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
    Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
    Notice the type of exception which is produced. Now try to assign a value to the array index 5.
    You should get the same type of exception.*/
    private static void arrayOutOfBoundExample() {
        int[] numArray = new int[5];
        System.out.println("Please enter 5 numbers : ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numArray[i] = input.nextInt();
        }
        System.out.println("Value at first index is " + numArray[0]);
        System.out.println("Value at the last index is " + numArray[numArray.length - 1]);
//        System.out.println(numArray[numArray.length]);
//        numArray[numArray.length] = 1;
    }

    /*Write a program where you create an integer array with a length of 5.
    Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.*/
    private static void loopingThroughArray() {
        int[] numArray = new int[5];
        for (int i = 0; i < 5; i++) {
            numArray[i] = i;
        }
        for (int i : numArray) {
            System.out.println(i);
        }
    }

    /*Write a program where you create an integer array of 5 numbers.
    Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.*/
    private static void loopThroughArrAndValAssignment() {
        int[] numArray = new int[5];
        for (int i = 0; i < 5; i++) {
            numArray[i] = i*2;
        }
        for (int i : numArray) {
            System.out.println(i);
        }
    }

    /*Write a program where you create an array of 5 elements.
    Loop through the array and print the value of each element, except for the middle (index 2) element.*/
    private static void loopThroughArrAndPrintVal() {
        int[] numArray = new int[5];
        System.out.println("Please enter 5 numbers : ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numArray[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (i == 5 / 2)
                continue;
            System.out.println(numArray[i]);
        }
    }

    /*Write a program that creates a String array of 5 elements and swaps the first element with the middle
    element without creating a new array.*/
    private static void swapFirstEleWithMidElement() {
        String[] strArray = new String[5];
        System.out.println("Please enter 5 strings : ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            if (i == 0) {
                strArray[strArray.length / 2] = input.next();
            } else if (i == strArray.length / 2) {
                strArray[0] = input.next();
            } else {
                strArray[i] = input.next();
            }
        }
        for (String str : strArray)
            System.out.println(str);
    }

    /*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
    Print the array in ascending order, print the smallest and the largest element of the array.
    The output will look like the following:
    Array in ascending order: 0, 1, 2, 4, 9, 13
    The smallest number is 0
    The biggest number is 13*/
    private static void sortArray() {
        int[] numArray = {4, 2, 9, 13, 1, 0};
        Arrays.sort(numArray);
        System.out.println("Array in ascending order : " + Arrays.toString(numArray));
        System.out.println("Smallest element of array : " + numArray[0]);
        System.out.println("Largest element of array : " + numArray[numArray.length - 1]);
    }

    /*Create an array that includes an integer, 3 strings, and 1 double. Print the array.*/
    private static void createMultipleDataTypeArray() {
        Object[] array = {"adas", "asd", "wer", 1, 2.5};
        System.out.println(Arrays.toString(array));
    }

}