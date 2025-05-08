import java.util.HashMap;

class GFG {
    static boolean areAnagrams(String s1, String s2) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : s1.toCharArray())
        charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

        for (char ch : s2.toCharArray())
        charCount.put(ch, charCount.getOrDefault(ch,0) - 1);

        for (var pair : charCount.entrySet()) {
            if (pair.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "siti";
        String s2 = "itis";
        System.out.println(areAnagrams(s1,s2)?"true":"false");
    }
}