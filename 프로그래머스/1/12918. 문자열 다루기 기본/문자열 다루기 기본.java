class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        // 길이가 4나 6, 둘 중 하나라도 아니면 false 리턴
        if(s.length() != 4 && s.length() != 6) {
            return false;
        }
        // 숫자가 아닐 경우 false 리턴 
        // for문으로 s길이 만큼 순회한 다음 charAt으로 바꿔서 숫자 확인
        for(int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return answer;
    }
}