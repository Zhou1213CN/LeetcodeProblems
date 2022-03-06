class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s == null) return 0;
        if (s.isBlank()) return 1;
        
        int[] map = new int[129];
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length();j++){
            map[(int) s.charAt(j)]++;
            while (i < s.length() && map[(int)s.charAt(j)] > 1){
                map[(int) s.charAt(i)]--;
                i++;
            }
            max = Math.max(max, j-i+1);
        }
        
        return max;
    }
}