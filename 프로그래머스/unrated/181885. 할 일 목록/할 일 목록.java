import java.util.*;

class Solution {
    public ArrayList solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer =new ArrayList<>();
        
        for(int i=0;i<finished.length;i++){
            if(finished[i]==false){
                answer.add(todo_list[i]);
            }
        }
        return answer;
    }
}