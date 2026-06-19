
class Solution {

    private static boolean isAnagram(String s, String t){
        if (s.length()!=t.length()) return false;
        HashMap<Character,Integer> freqMap = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }

        for (char c: t.toCharArray()){

            if(!freqMap.containsKey(c)) return false;

            freqMap.put(c, freqMap.getOrDefault(c,0)-1);

            if (freqMap.get(c)<0) return false;

        }

        return true;
    }


    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Integer ,Boolean> visited = new LinkedHashMap<>();
        List<List<String>> groupList = new ArrayList<>();

        for (int parent=0 ; parent<strs.length; parent++){

            if (Boolean.TRUE.equals(visited.getOrDefault(parent,Boolean.FALSE))) continue;

            List<String> group = new ArrayList<>();

            group.add(strs[parent]);
            visited.put(parent,true);

            for (int child=parent+1 ; child<strs.length; child++){
                if (Boolean.TRUE.equals(visited.getOrDefault(child,Boolean.FALSE))) continue;

                if (isAnagram(strs[parent],strs[child])){
                    group.add(strs[child]);
                    visited.put(child,true);
                }
            }

            groupList.add(group);

        }


        return groupList;


    }
}
