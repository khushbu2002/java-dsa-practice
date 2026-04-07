public class MissingNumber {
    //thsi is the Leetcode probelm

    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = n*(n+1)/2;

        int arraySum=0;

        for(int i=0; i<=nums.length-1; i++) {

            arraySum = arraySum + nums[i];

        }

        int result = sum - arraySum;
        return result;

        //this is the same solution of my leetcode problem
        //there is anther way to solve this problem using XOR
        //I will try it and update the file then.

    }

    public static void main(String arg[]) {
        int arr[] = {3, 0, 2};
        System.out.println(missingNumber(arr));
    }
}
