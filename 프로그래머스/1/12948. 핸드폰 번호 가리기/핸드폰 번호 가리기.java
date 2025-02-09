class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        // 4자리 빼고 *로 바꾸기
        for(int i = 0; i < phone_number.length() - 4; i++) {
            sb.append('*');
        }
        // 4자리는 원래 번호로 붙여주기 (substring 사용해서 )
        sb.append(phone_number.substring(phone_number.length() - 4));
        
        
        return sb.toString();
    }
}