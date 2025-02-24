class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int pLen = p.length(); 
        long pLong = Long.parseLong(p); 
        
        for(int i = 0; i <= t.length() - pLen; i++) {
            String sub = t.substring(i, i + pLen);
            if(Long.parseLong(sub) <= pLong) {
                count++;
            }
        }
        
        return count;
    }
}