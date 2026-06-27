class Solution {
    public String encode(List<String> strs) {

        StringBuilder stringBuilder = new StringBuilder();

        strs.forEach(str -> {
            stringBuilder.append(str.length()).append('|').append(str);
        });

        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        // 5|hello5|world

        List<String> strs = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            while (str.charAt(j) != '|') {
                j++;
            }

            j++;

            int length = Integer.parseInt(str.substring(i, j - 1));
            String newStr = str.substring(j, j + length);

            strs.add(newStr);

            i = j + length;
        }


        return strs;
    }
}
