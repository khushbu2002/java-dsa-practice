import java.util.Arrays;

public class SecondLargestInArray {

    public static int secondLargestElementInArray (int arr[]) {

        if(arr.length == 0 ) {
            System.out.println("there is no element");
            return 0;
        }
        if(arr.length == 1 ) {
            System.out.println("there is only one element and that is: ");
            return arr[0];
        }
        Arrays.sort(arr);
        return arr[arr.length-2];

        // i will write another function with another logic

    }

    public static void main(String arg[]) {
        int[] arr1 = {};
        int[] arr2 = {2};
        int[] arr3 = {5,9,2,4,8,1,-1};

        System.out.println(secondLargestElementInArray(arr1));
        System.out.println(secondLargestElementInArray(arr2));
        System.out.println(secondLargestElementInArray(arr3));
    }

}
