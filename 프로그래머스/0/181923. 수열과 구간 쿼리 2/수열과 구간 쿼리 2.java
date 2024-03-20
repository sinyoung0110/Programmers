class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer =new int[queries.length];
        int min=1000000;
        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][0];j<=queries[i][1];j++){
                if(queries[i][2]<arr[j]){
                    if(min>arr[j]){
                        min=arr[j];
                    }
                }   
            }answer[i]=min==1000000?-1:min;
            min=1000000;
        }
        return answer;
    }
}