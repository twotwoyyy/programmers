import java.util.*;

public class Solution {
    public int[] solution(int [] arr) {
        ArrayList<Integer> result = new ArrayList<>(); 
        
        for(int i = 0; i < arr.length; i++) {
            if(i == 0 || arr[i] != arr[i - 1]) { // 이전 요소와 다르면 추가
                result.add(arr[i]);
            }
        }
        
        // 다시 int[] 배열로
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}