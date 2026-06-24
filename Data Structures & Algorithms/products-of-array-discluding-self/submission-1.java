class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product = 1;
        int[] result = new int[nums.length];

        for (int i : nums) {
            if (i == 0) {
                zeroCount++;
                continue;
            }
            product = product * i;
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                result[i] = 0;
                continue;
            } else if (zeroCount == 1) {
                if (nums[i] == 0)
                    result[i] = product;
                else
                    result[i] = 0;
            } else
                result[i] = product / nums[i];
        }

        return result;
    }
}
