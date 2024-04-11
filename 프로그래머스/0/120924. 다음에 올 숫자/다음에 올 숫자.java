class Solution {
    public int solution(int[] common) {
        int answer = 1;
        answer=common[2]==common[1]+common[1]-common[0]?common[common.length-1]+common[1]-common[0]:common[1]/common[0]*common[common.length-1];
        
        return answer;
    }
}