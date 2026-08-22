class Solution {
    public int lengthOfLongestSubstring(String s) {
        // abba
        //a - 0.  r=3  l =1
        //b - 1.   l = 2
        Map<Character, Integer> frequence = new HashMap<>();

        int l = 0;
        int r = 0;
        int longlength = 0;

        while (r < s.length()) {
            if (frequence.get(s.charAt(r)) != null) {
              l = Math.max(l,frequence.get(s.charAt(r)) + 1);
            }

            frequence.put(s.charAt(r), r);
            int len = r - l + 1;
            longlength = Math.max(longlength, len);
            r++;
        }

        return longlength;
    }
}
