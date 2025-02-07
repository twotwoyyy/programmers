class Solution {
    public int solution(int[] numbers) {
        int[] check = new int[10];
        int answer = 0;
        
        for(int n : numbers) {
            check[n]=1;
        }
        
        for(int i = 0; i <= 9; i++){
            if(check[i] != 1) {
                answer += i;
            }
        }
        
        return answer;
    }
}