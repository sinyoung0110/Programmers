import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> que=new LinkedList<>();
        int[] answer;
        int temp=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==temp)
                continue;
            else{
                temp=arr[i];
                que.offer(temp); 
            }
        }
        answer=new int[que.size()];
        int cnt=0;
		for (Integer i : que) {
			answer[cnt++]=i;
		}
        return answer;

    }
}