import java.util.HashMap;

class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode")); // Output: 0
    }
}
