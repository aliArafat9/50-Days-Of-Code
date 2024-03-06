package day96;

public class ConsecutiveCharacters {
    public static int maxPower(String s) {
        int count = 0;
        int max = 0;
        char[] array = s.toCharArray();

        for (int i = 1; i < s.length(); i++) {
            if (array[i - 1] == array[i]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max + 1;
    }

    public static void main(String[] args) {
        String input = "leetcode";
        int result = maxPower(input);

        System.out.println("Maximum consecutive characters power: " + result);
    }
}
