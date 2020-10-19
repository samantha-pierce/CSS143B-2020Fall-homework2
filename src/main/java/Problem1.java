public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    There are three pointers for the start, middle, and end of the given array, which
    represent the values needed to be sorted, red (0), yellow (1), and green (2). There's
    a loop that continues until the middle pointer and end pointer meet. In the loop,
    we check if the middle pointer's value is representing yellow, so if it equals 0 that
    means it's incorrectly representing red, and we need to swap with the start pointer
    to place red at the start of the list and increment both start and middle pointers to
    update the loop. If it's 2, it's incorrectly representing green, so we swap and
    place green at the end of the list, and decrement the end pointer. Finally, if it's 1,
    then it's the correct color and all we need to do is increment the middle pointer.
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
// to explain to me how the implementation works
