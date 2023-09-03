class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        for(int i=0;i<computers.length;i++){
            if(!check[i]){
                dfs(check,computers,i);
                answer++;
            }
        }
        return answer;
    }
    public boolean[] dfs(boolean[] check,int[][] computers,int i){
        check[i]=true;
        for(int j=0;j<computers.length;j++){
            if(check[j]==false&&computers[i][j]==1&&i!=j){
                check=dfs(check,computers,j);
            }
        }return check;
    }
}