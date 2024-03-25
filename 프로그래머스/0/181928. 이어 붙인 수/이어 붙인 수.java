class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String eve="";
        String odd="";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0)
                eve+=String.valueOf(num_list[i]);
            else
                odd+=String.valueOf(num_list[i]);
        }
        return Integer.valueOf(eve)+Integer.valueOf(odd);
    }
}