package easy.leetcode;

import java.util.HashMap;

public class LongestSubString {
	public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        int n = s.length();
        int ans = 0, i = 0;
        for(int j=0;j<n;j++){
                if(hmap.containsKey(s.charAt(j))){
                    i = Math.max(hmap.get(s.charAt(j)),i);
                }
                hmap.put(s.charAt(j),j+1);
                ans = Math.max(ans,j-i+1);
        }
        
        return ans;
	}
}
