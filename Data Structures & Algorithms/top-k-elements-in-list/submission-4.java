class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (Integer key : freqMap.keySet()) {

            int freq = freqMap.get(key);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(key);
        }

        int[] topK = new int[k];
        int count = 0;

        for (int freq = buckets.length - 1; freq >= 0; freq--) {

            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    topK[count] = num;
                    count++;

                    if (count == k) return topK;
                }
            }

        }

        return topK;

    }
}

