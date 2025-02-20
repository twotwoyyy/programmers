import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 5 (열, col)
        int b = sc.nextInt(); // 3 (행, row)
        
        for (int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}