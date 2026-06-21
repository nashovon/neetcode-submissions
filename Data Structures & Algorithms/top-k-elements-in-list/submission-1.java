class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        List<Integer> top = new ArrayList<>(freqMap.keySet());

        top.sort((a, b) -> freqMap.get(b) - freqMap.get(a));

        return top.stream().limit(k).mapToInt(Integer::intValue).toArray();
    }
}
