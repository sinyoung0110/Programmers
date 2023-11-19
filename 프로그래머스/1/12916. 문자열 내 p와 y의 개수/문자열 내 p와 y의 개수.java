class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == 'y') {
                sum++;
            } else if (Character.toLowerCase(s.charAt(i)) == 'p') {
                sum--;
            }
        }
        if (sum != 0) {
            answer = false;
        }

        return answer;
    }
}
