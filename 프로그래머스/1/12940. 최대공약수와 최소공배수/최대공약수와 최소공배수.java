class Solution {
    public int[] solution(int n, int m) {
        int div = getDiv(n,m);
        int mul = (n * m) / div;
        // 최소 공배수는 두 수의 곱인 36 나누기 최대 공약수 3 = 12
        return new int[]{div, mul};
    }
    
    private int getDiv(int a, int b) {
        while (b != 0) { // b가 0이 될 때까지 
            int temp = b; 
            b = a % b; // a를 b로 나눈 나머지를 새로운 b로 다시 설정 
            // a가 3, b가 12일 때 b는 3이 되고
            a = temp; // 기존 b값을 a에 저장 
            // a는 다시 12가 되어 12 % 3 = 0 
        }
        return a; // 나머지가 0이 된 후의 a가 최대 공약수 
        // 그러면 a는 3, b는 0이니까 3이 최대 공약수 
    }
}