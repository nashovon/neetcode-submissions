class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> seenMap = new LinkedHashMap<>();

        for(char i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            int freq = Objects.isNull(seenMap.get(c)) ? 0 : seenMap.get(c);
            seenMap.put(c, ++freq);
        }

        for(char i = 0; i<t.length(); i++){
            char c = t.charAt(i);
            Integer val = seenMap.get(c);
            if(val!=null){
                Integer freq = seenMap.get(c);
                seenMap.put(c,--freq);
            }else return false;
        }


        for(char i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(seenMap.get(c)!=0) return false;
        }

        return true;

    }
}