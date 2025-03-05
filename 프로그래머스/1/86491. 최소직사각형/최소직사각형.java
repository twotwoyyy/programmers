class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for(int [] s : sizes) {
            int w = s[0];
            int h = s[1];
            
            if(w < h) {
                int temp = w;
                w = h;
                h = temp;
            }
            
            maxW = Math.max(maxW,w);
            maxH = Math.max(maxH,h);
        }
        
        return maxW * maxH;
    }
}