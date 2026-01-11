package Data_Structures.Array.ID_Array;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseUsingNewArray(int[] arr) {

        int n = arr.length;
        int[] reversed = new int[n];   // new array banaya

        int index = 0;

        for (int i = n - 1; i >= 0; i--) {
            reversed[index] = arr[i];
            index++;
        }

        return reversed;
    }

    public static int[] reverseUsingTwoPointers(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }


    // this method is made to be used to reverse any type of array, in this we will use generics.
    public static <T> T[] reverseUsingGeneric(T[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            T temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] arg) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {99, 8, 56, 17, 67};
        String[] arr3 = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(reverseUsingNewArray(arr1))); //method 1
        System.out.println(Arrays.toString(reverseUsingTwoPointers(arr2))); //---> using 2 pointer method , this one uses less space.
        System.out.println(Arrays.toString(reverseUsingGeneric(arr3)));

    }
}
