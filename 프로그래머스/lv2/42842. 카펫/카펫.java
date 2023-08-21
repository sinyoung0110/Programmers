class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int S=brown+yellow;
        
        for(int width=S-1;width>0;width--){
            if(S%width==0){
                int height=S/width;
                int y=(width-2)*(height-2);
                int b=S-y;
                
                if(y==yellow&&b==brown){
                    answer[0]=width;
                    answer[1]=height;
                    break;
                }
            }
            else
                continue;
        }
        
        return answer;
    }
}