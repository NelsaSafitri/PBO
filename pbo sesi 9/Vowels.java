import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Vowels {
    // Set immutable berisi semua huruf vokal (upper dan lower case)
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u',
                                                        'A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in); 

        String Kata;
        System.out.println("\n masukin katanya manis :");
        Kata = userinput.nextLine();
        long vowelCount = countVowels(Kata);
        
        System.out.println("Kalimat: \"" + Kata + "\"");
        System.out.println("Jumlah huruf vokal: " + vowelCount);
        userinput.close();
    }

    public static long countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        return IntStream.range(0, str.length())
                .mapToObj(str::charAt)       // Konversi ke stream of Characters
                .filter(VOWELS::contains)     // Filter hanya huruf vokal
                .count();                     // Hitung jumlahnya
                
    }
    
}
