import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC7 {

    // Static Inner Class to store character and its pattern
    static class CharacterPattern {

        private char letter;
        private String[] pattern;

        public CharacterPattern(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        public char getLetter() {
            return letter;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Map to store all character patterns
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        // Add pattern for O
        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        // Add pattern for P
        patternMap.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        // Add pattern for S
        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        // Build banner dynamically
        for (char ch : word.toCharArray()) {

            CharacterPattern cp = patternMap.get(ch);

            if (cp != null) {
                String[] letterPattern = cp.getPattern();

                for (int i = 0; i < 7; i++) {
                    banner[i].append(letterPattern[i]).append("  ");
                }
            }
        }

        // Print final banner
        for (int i = 0; i < 7; i++) {
            System.out.println(banner[i]);
        }
    }
}