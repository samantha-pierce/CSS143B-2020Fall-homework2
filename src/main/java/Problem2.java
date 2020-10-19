public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int lengthCounter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[lengthCounter] != nums[i]) {
                lengthCounter++;
                nums[lengthCounter] = nums[i];
            }
        }
        return lengthCounter + 1;
    }
}

// credit to https://leetcode.com/problems/remove-duplicates-from-sorted-array/solution/
// for help with implementation
