class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> seenMap = new LinkedHashMap<>();


        for (char c: s.toCharArray()){
            seenMap.put(c, seenMap.getOrDefault(c,0)+1);
        }

        for (char c: t.toCharArray()){
            Integer val = seenMap.get(c);
            if(val!=null){
                Integer freq = seenMap.get(c);
                seenMap.put(c,--freq);

                if (seenMap.get(c) < 0) {
                    return false;
                }
                
            }else return false;
        }


        return true;

    }
}