
import java.util.Arrays;

public class StudentNameFormatter {
    private static final String TARGET_NAME = "Mohamed";
    private static final String REPLACEMENT_NAME = "Muhammad";

    public static void main(String[] args) {
        String[] students = {
            "Mohamed Ahmed", "Mohamed Ali", "Mohamed Salah",
            "Mohamed Hassan", "Mohamed Ibrahim", "Mohamed Noor",
            "Mohamed Farah", "Mohamed Yusuf", "Mohamed Ismail",
            "Mohamed Kamal"
        };
        Arrays.stream(students)
        .map(StudentNameFormatter::formatName)
        .forEach(System.out::println);
    }

    private static String formatName(String fullName) {
        String[] parts = fullName.split( " ", 2);
        String firstName = parts[0].equalsIgnoreCase(TARGET_NAME)
        ? REPLACEMENT_NAME
        : parts[0];

        return parts.length > 1 
        ? parts[1] + ", " + firstName
        : firstName;

    }
    
}
