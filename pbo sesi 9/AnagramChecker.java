import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    public static boolean areAnagrams(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        // Tambahkan karakter dari string pertama
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Kurangi karakter dari string kedua
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!freqMap.containsKey(c)) {
                return false;
            }
            freqMap.put(c, freqMap.get(c) - 1);
            if (freqMap.get(c) < 0) {
                return false;
            }
        }

        // Semua nilai harus nol
        return freqMap.values().stream().allMatch(count -> count == 0);
    }

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        if (areAnagrams(a, b)) {
            System.out.printf("\"%s\" and \"%s\" are anagrams.%n", a, b);
        } else {
            System.out.printf("\"%s\" and \"%s\" are NOT anagrams.%n", a, b);
        }
    }
}
