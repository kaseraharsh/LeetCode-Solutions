class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        char[] ans = new char[s.length()];
        int i = arr.length - 1;
        int b = 0;
        while (i >= 0) {
            while (i >= 0 && arr[i] == ' ') {
                i--;
            }
            if (i < 0) break;
            int j = i;
            while (i >= 0 && arr[i] != ' ') {
                i--;
            }
            for (int a = i + 1; a <= j; a++) {
                ans[b] = arr[a];
                b++;
            }
            int temp = i;
            while (temp >= 0 && arr[temp] == ' ') {
                temp--;
            }
            if (temp >= 0) {
                ans[b] = ' ';
                b++;
            }
        }

        return new String(ans, 0, b);
    }
}