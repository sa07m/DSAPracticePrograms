
https://leetcode.com/problems/concatenation-of-array/

public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] ans = new int[2 * n];

    for (int i = 0; i < n; i++) {
        ans[i] = nums[i];            // Copy the current element from nums to ans
        ans[i + n] = nums[i];        // Copy the same element to the second half of ans
    }

    return ans;
}


