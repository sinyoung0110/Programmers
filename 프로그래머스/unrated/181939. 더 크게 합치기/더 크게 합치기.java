class Solution {
    public int solution(int a, int b) {
        String answer1=String.valueOf(a)+String.valueOf(b);
        String answer2=String.valueOf(b)+String.valueOf(a);
        if(Integer.parseInt(answer1)>=Integer.parseInt(answer2)){
            return Integer.parseInt(answer1);
        }
        else
            return Integer.parseInt(answer2);
    }
}