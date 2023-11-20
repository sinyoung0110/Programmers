import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            return new int[]{-1};
        }

        answer.sort(Comparator.naturalOrder());

        // ArrayList를 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
