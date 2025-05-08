import java.util.Scanner;
public class Palindrome {public static void main(String[] args) throws Exception {
        Scanner userinput = new Scanner(System.in);

        String kata;
        String kataPalindrome = "";
        int panjangkata;
        
        System.out.println("\t Menentukan Kata Palindrome kuy\n");

        System.out.print(" Masukin Katanya Manis : ");
        kata = userinput.nextLine();

        panjangkata = kata.length();

        for(int i = panjangkata - 1; i >= 0; i--){
            kataPalindrome = kataPalindrome + kata.charAt(i);
        }
        if (kata.equals(kataPalindrome)) {
            System.out.println("\n kata " + " Kalo beginian termasuk ke kata palindrome cuyy");
        }
        else {
            System.out.println("\n kata " + "kalo beginian mah bukan kata palindrome atuh");
            userinput.close();
        }
        
    }
    
}
