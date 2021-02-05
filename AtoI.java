package easy.leetcode;

public class AtoI {
	public static int myAtoi(String s) {
        int i = 0;
        //int n = s.length();
        int sign = 1,result = 0;;
        if(s.length()==0){
            return 0;
        }
        while(s.charAt(i)==' ' && i<s.length()){
            i++;
        }
        if((s.charAt(i)=='+' || s.charAt(i)=='-')&&i<s.length()){
            if(s.charAt(i)=='+')
                sign = 1;
            else
                sign = -1;
            i++;
        }
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && s.charAt(i)-'0' > Integer.MAX_VALUE%10)){
               if(sign==1){
                   return Integer.MAX_VALUE;
               }
               else{
                   return Integer.MIN_VALUE;
               }
            }
            result = result * 10 + (s.charAt(i)-'0');
            i++;
        }
        return result*sign;
    }
	public static void main(String[] args) {
		String str = "4193 with words";
		int ans = myAtoi(str);
		System.out.println(ans);
	}
}

