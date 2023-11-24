import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];               

        List<Integer> yetClear = new ArrayList<>();
        List<Integer> arrived = new ArrayList<>();

        for(int i=0; i<N; i++){
            int clearY = 0;
            int ar = 0;
            for(int x=0; x<stages.length; x++){
                if(stages[x]==i+1)
                    clearY++;
                if(stages[x]>=i+1)
                    ar++;                                                    
            }            
            if(ar==0)
                ar=1;
            yetClear.add(clearY);
            arrived.add(ar);            
        }

        List<Double> result = new ArrayList<>();

        for(int i=0; i<N; i++){
            double fail = (double)yetClear.get(i) / (double)arrived.get(i);
            result.add(fail);           
        } 
        List<Double> copied = new ArrayList<>(result);
        copied.sort(Comparator.reverseOrder());          

        for(int i=0; i<copied.size(); i++){
            for(int x=0; x< result.size(); x++){
            if(copied.get(i)==result.get(x))
                answer[i] = x+1;                
            }
        }

        return answer;
    }
}