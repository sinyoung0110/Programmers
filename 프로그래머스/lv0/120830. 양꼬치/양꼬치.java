class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int a=n;
        while(a>=10){
            a-=10;
            k--;
            
        }
            
    
        answer=12000*n+k*2000;
        return answer;
    }
}