public class BinarySearchLC {

    //this question is a solution to 704. Binary Search Leetcode Problem
    //Here we have been give an int array and we have to find a number n in the array.
    //Please refer to 704. Binary Search Leetcode Problem for better understanding of the problem.

    public static int searchNumInArray(int arr[], int num) {
        int start = arr[0];
        int last = arr.length-1;

        while (start <= last) {
            int mid = start + (last - start) / 2;

            if (arr[mid] == num) {
                return mid;
            }
            else if (arr[mid] < num) {
                start = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String arg[]) {
        int arr[] = {1, 6, 12, 34, 9, 64, 67, 42, 13, 22, 9, 55, 27, 97, 81, 72, 20};
        System.out.println(searchNumInArray(arr, 9));
    }
}
