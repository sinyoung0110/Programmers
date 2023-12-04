import java.util.*;
class Solution {
    public List solution(int[] answers) {
        List<Integer> answer=new ArrayList<>();
        int[] first={1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] score = {0,0,0};
        
        int max=0;
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == first[i%first.length]) 
                score[0]++;
            if(answers[i] == second[i%second.length]) 
                score[1]++;
            if(answers[i] == third[i%third.length]) 
                score[2]++;
        }
        //최대값 구하기
        max=score[0]>score[1]?score[0]>score[2]?score[0]:score[2]:score[1]>score[2]?score[1]:score[2];
           
        for(int i=0; i<score.length; i++) 
            if(max == score[i]) 
                answer.add(i+1);

        return answer;
    }
}