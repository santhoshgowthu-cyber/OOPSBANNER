import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        // Centralized pattern storage using HashMap
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        String word = "OOPS";

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        // Build banner dynamically using HashMap lookup
        for (char ch : word.toCharArray()) {

            String[] letterPattern = patternMap.get(ch);

            if (letterPattern != null) {
                for (int i = 0; i < 7; i++) {
                    banner[i].append(letterPattern[i]).append("  ");
                }
            }
        }

        // Display final banner
        for (int i = 0; i < 7; i++) {
            System.out.println(banner[i]);
        }
    }
}