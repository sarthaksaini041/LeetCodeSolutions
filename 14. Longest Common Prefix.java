class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length())
                min = strs[i].length();
        }

        for (int j = 0; j < min; j++) {
            int count = 0;
            String a = strs[0].substring(0, j + 1);
            for (int i = 0; i < strs.length; i++) {

                String b = strs[i].substring(0, j + 1);
                if (a.equals(b))
                    count++;
            }
            if (count == strs.length)
                s = a;
        }
        return s;
    }
}