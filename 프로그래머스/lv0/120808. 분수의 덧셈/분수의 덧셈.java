class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        if(denom1==denom2){
            answer[0]=numer1+numer2;
            answer[1]=denom1;
        }
        else{
            int i= denom1*denom2;
            int j= (numer1*denom2)+(numer2*denom1);
            for(int k=1; k<j; k++){
                if(j%k==0){
                    j=j/k;
                    i=i/k;
                }
                    
                    
            }           
            
            answer[0]=j;
            answer[1]=i;
            }
        return answer;
    }
}