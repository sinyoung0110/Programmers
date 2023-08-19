class Solution {
    public int solution(String my_string, String is_prefix) {
        
        if(my_string.indexOf(is_prefix)==0){
            
            return 1;
        }
        else
            return 0;
        
    }
}