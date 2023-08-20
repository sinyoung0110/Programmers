class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int j=0;
        for(int i:arr){
            if(i>=50&&i%2==0){
                answer[j++]=i/2;
            }
            else if(i<50&&i%2!=0)
                answer[j++]=i*2;
            else
                answer[j++]=i;
        }
        
        return answer;
    }
}