public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    There is one loop that iterates through the given array and a pointer, lengthCounter, that
    starts at the beginning of the array. Within the loop, we continue through the array until a unique
    value has been found, which we then increment lengthCounter by one and then place the unique value
    where LengthCounter is pointing. Once the loop reaches the end of the array, the array has removed
    all duplicates, and we return lengthCounter plus 1 in order to return the new length of the array.
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
                lengthCounter += 1;
                nums[lengthCounter] = nums[i];
            }
        }
        return lengthCounter + 1;
    }
}

// credit to https://leetcode.com/problems/remove-duplicates-from-sorted-array/solution/
// for help with implementation
