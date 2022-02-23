package com.zlateva;

public class Main {

    public static void main(String[] args) {
//    -Write a method called reverse() with an int array as a parameter.
//    -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//    -In main() test the reverse() method and print the array both reversed and non-reversed.
//    -To reverse the array, you have to swap the elements, so that the first element is swapped
//    with the last element and so on.
//     -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//        Tip:
//     -Create a new console project with the name eReverseArrayChallengef

        int[] array = new int[]{1, 2, 3, 4, 5};
        print(array);
        reverse(array);
        print(array);
    }

    private static void reverse(int[] array) {
        int first = 0;
        int last = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[first];
            array[first++] = array[last];
            array[last--] = temp;
        }
    }

    private static void print(int[] array) {
        System.out.print("Element = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i < array.length - 1) ? (array[i] + ", ") : (array[i] + "]\n"));
        }
    }

}
