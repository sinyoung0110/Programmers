class Solution {
    public String[] solution(String[] names) {
        int size;
        if(names.length%5==0) size = (names.length/5);
        else size = (names.length/5)+1;
        String[] answer = new String[size];
        int j=0;
        for(int i=0;i<names.length;i+=5){
            answer[j++]=names[i];
        }
        return answer;
    }
}