import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeating(str);

        if(result != 0)
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No unique character found");
    }

    public static char firstNonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // count frequency
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // find first with frequency 1
        for(char c : s.toCharArray()) {
            if(map.get(c) == 1) {
                return c;
            }
        }
        return 0;
    }
}
