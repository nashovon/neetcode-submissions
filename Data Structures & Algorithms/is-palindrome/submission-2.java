
class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if ((c >= 'A' & c <= 'Z') || (c >= 'a' & c <= 'z')|| (c >= '0' & c <= '9')) stringBuilder.append(c);
        }

        String cleanedStr = stringBuilder.toString().toLowerCase();
        int length = cleanedStr.length();

        int midPoint = length / 2;


        if (length % 2 != 0) {
            for (int i = midPoint - 1, j = midPoint + 1; i >= 0 || j < length; i--, j++) {
                if (cleanedStr.charAt(i) != cleanedStr.charAt(j)) return false;
            }
        }else {
            for (int i = midPoint-1, j = midPoint; i >= 0 || j < length; i--, j++) {
                if (cleanedStr.charAt(i) != cleanedStr.charAt(j)) return false;
            }
        }


        return true;
    }
}

