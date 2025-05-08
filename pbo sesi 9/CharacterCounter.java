//untuk nomor 4,5,6 disatukan menjadi 1 code
import java.util.*;
import java.util.stream.Collectors;

public class CharacterCounter {
    private final Map<Character, Integer> charCountMap;
    private final String inputString;

    public CharacterCounter(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        this.inputString = inputString;
        this.charCountMap = countCharacters();
    }

    private Map<Character, Integer> countCharacters() {
        return inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(
                    c -> c,
                    c -> 1,
                    Integer::sum,
                    HashMap::new
                ));
    }

    public String getUniqueCharactersString() {
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : inputString.toCharArray()) {
            seen.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : seen) {
            sb.append(c);
        }
        return sb.toString();
    }

    public Map<Character, Integer> getCharacterCounts() {
        return new HashMap<>(charCountMap);
    }

    public void printCharacterCounts() {
        System.out.printf("%nCharacter counts in \"%s\":%n", inputString);
        charCountMap.forEach((k, v) -> 
            System.out.printf("'%c': %d%n", k, v)
        );
    }

    public void printUniqueCharacterString() {
        System.out.printf("%nUnique characters string (duplicates removed): %s%n", getUniqueCharactersString());
    }

    // 🎯 Menambahkan method baru: karakter paling sering muncul
    public void printMostFrequentCharacters() {
        if (charCountMap.isEmpty()) {
            System.out.println("No characters to analyze.");
            return;
        }

        int maxCount = Collections.max(charCountMap.values());

        List<Character> mostFrequent = charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.printf("%nMost frequent character(s) [occurred %d time(s)]: %s%n",
                maxCount, mostFrequent);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String userInput = scanner.nextLine();

            CharacterCounter counter = new CharacterCounter(userInput);
            counter.printCharacterCounts();
            counter.printUniqueCharacterString();
            counter.printMostFrequentCharacters();
        }
    }
}
