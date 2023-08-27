class Solution {
    public int solution(String name) {
        int answer=0;
        int move = name.length()-1; // 좌우이동횟수
        
        for(int i=0; i<name.length();i++){
            // 상하이동
            if(name.charAt(i)<'N'){
                answer += name.charAt(i)-'A';
            }else{
                answer += 'Z' - name.charAt(i)+1;
            }
            
            // A의 마지막 위치구함
            int lastA = i+1;
            while(lastA <name.length() && name.charAt(lastA) =='A'){
                lastA++;
            }
			// 좌우이동
            move = Math.min(move, i+(name.length()-lastA)+Math.min(i,name.length()-lastA));
        }
        
        return answer+move;
    }
}