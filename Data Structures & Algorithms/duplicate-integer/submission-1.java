class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> seenMap = new HashMap();

        for (int i = 0;i<nums.length;i++){
            if(Objects.nonNull(seenMap.get(nums[i]))) return true;
            seenMap.put(nums[i],i);
        }

        return false;

    }
}