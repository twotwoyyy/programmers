class Solution {
    public String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;
        if(s.length() % 2 == 0) { // 짝수일 경우 두 글자
            return s.substring(mid-1,mid+1); // 4글자면 substring(1,3) 
            // mid는 2일 경우 mid-1, mid+1
        }
        
        return String.valueOf(s.charAt(mid));
    }
}