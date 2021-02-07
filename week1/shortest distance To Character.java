class Solution {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] rst = new int[len];
        int prev = -0x3f3f3f3f;

        // left to right
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            rst[i] = i - prev;
        }

        // right to left
        prev = 0x3f3f3f3f;
        for (int i = len-1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            // get the smaller one of the two answers
            rst[i] = Math.min(rst[i], prev - i);
        }

        return rst;  
    }
}
