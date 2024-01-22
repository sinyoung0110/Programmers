class Solution {
    public int[] solution(int n) {
        int[] answer;
        if(n%2==0)
             answer= new int[n/2];
        else
            answer = new int[n/2+1];
        
        int k=0;
        
        for(int j=1;j<=n; j++){
            if(j%2!=0){
                answer[k]=j;
                k++;
            }
        }
        return answer;
    }
}