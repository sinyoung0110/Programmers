class Solution {
    public int solution(String myString, String pat) {
        String str="";
        for(int i=0;i<pat.length();i++){
            if(pat.substring(i,i+1).equals("A")){
                str+="B";
            }
            else
                str+="A";
        }
        if(myString.contains(str))
            return 1;
        else
            return 0;
    }
}