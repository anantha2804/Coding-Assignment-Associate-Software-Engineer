import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = scanner.nextLine();
        
        if (isPangram(str.toLowerCase())) {
            System.out.println("Pangram.");
        } else {
            System.out.println("not a pangram.");
        }
    }

    private static boolean isPangram(String str) {
        Set<Character> charSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            charSet.add(c);
        }
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charSet.remove(c);
            }
        }
        return charSet.isEmpty();
    }
}
