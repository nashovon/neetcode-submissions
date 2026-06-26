
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> existsMap = new HashMap<>();
        int maxCq = 0;

        for (int n : nums) {
            existsMap.put(n, true);
        }

        for (int n : nums) {
            int pointer = n;
            int length = 0;

            while (existsMap.get(pointer) != null) {
                pointer++;
                length++;
                maxCq = Integer.max(maxCq, length);
            }
        }

        return maxCq;
    }
}
