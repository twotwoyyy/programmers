class Solution {
    public int solution(int n) {
        int answer = 0;
        String re = ""; // 문자+숫자 = 문자니까 문자로 뒤집어 저장 
        while(n > 0) { // 3으로 계속 나누며 저장 
           re += n % 3;
            n /= 3;
        }
        //다시 10진수로 
        for(int i = 0; i < re.length(); i++) {
            int num = re.charAt(i) - '0'; // 문자 => 숫자 : 48 빼주기
            answer = answer * 3 + num;
        }
        
        return answer;
    }
}