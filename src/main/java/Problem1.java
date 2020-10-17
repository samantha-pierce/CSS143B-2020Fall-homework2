public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int start = 0, mid = 0;
        int end = nums.length - 1;
        int temp;
        while (mid <= end) {
            if (nums[mid] == 0) {
                temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            } else if (nums[mid] == 2) {
                temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            } else {
                // nums[mid] == 1
                mid++;
            }
        }
    }
}

// credit to https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/ for
// help with implementation and https://www.youtube.com/watch?v=mW9Ajz3y_l0
// for explanation
