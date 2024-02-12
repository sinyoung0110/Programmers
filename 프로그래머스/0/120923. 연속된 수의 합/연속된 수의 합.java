class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int j=0;
        int avg=total/num;
        int div=num/2;
        if(total%num==0){
            if(num%2==0){
                for(int i=avg-div;i<avg+div;i++){
                    answer[j++]=i;
                }
            }
            else{
                for(int i=avg-div;i<=avg+div;i++){
                    answer[j++]=i;
                }
            }
        }else{
            for(int i=avg-div+1;i<=avg+div;i++){
            answer[j++]=i;
            }
        }
        
        return answer;
    }
}