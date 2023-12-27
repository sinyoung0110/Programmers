class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int eve=0;
        int odd=0;
        for(int i=0;i<num_list.length;i++){
            if(i%2==0){
                eve+=num_list[i];
            }
            else
                odd+=num_list[i];
        }
        if(eve>=odd){
            answer=eve;
        }else
            answer=odd;
        return answer;
    }
}