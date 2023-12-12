import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        boolean[] check = new boolean[reserve.length];
        
        //lost={5,4}, reserve={3,4} 처럼 정렬이 안 된채로 있는 경우가 있다.
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //n=5, lost={4,5}, reserve={3,4} 일 때 도난 당한 여벌이 있는 애는 남에게 못 빌려줌
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(check[j]==false&&lost[i]==reserve[j]){
                    answer++;
                    check[j]=true;
                    lost[i]=-1;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        //위에 값을 제외하고 앞뒤로 체육복 찾기
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(check[j]==false&&(lost[i]==reserve[j]-1||lost[i]==reserve[j]+1)){
                    answer++;
                    check[j]=true;
                    break;
                }
                
            }
            
        }
        return answer;
    }
}