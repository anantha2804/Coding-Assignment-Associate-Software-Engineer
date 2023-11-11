import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Roman number ");
        String romanNum = scanner.nextLine();

        int res = romanToInt(romanNum);
        System.out.println("Integer value: " + res);
        
        
    }

    private static int romanToInt(String str) {
        Map<Character, Integer> rMap = RomanMap();

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int current = rMap.get(str.charAt(i));
            int next = (i + 1 < str.length()) ? rMap.get(str.charAt(i + 1)) : 0;

            if (current < next) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }

        return result;
    }

    private static Map<Character, Integer> RomanMap() {
        Map<Character, Integer> rMap = new HashMap<>();
        rMap.put('I', 1);
        rMap.put('V', 5);
        rMap.put('X', 10);
        rMap.put('L', 50);
        rMap.put('C', 100);
        rMap.put('D', 500);
        rMap.put('M', 1000);
        return rMap;
    }
}
