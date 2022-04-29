import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = new String[s.length()];
        
        for(int i = 0; i < str.length; i++){
            str[i] = String.valueOf(s.charAt(i));
        }
        
        Arrays.sort(str, Collections.reverseOrder());
        for(String string :  str){
            answer += string;
        }
        return answer;
    }
}