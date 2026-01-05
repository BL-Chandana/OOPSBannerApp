import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Banner using HashMap
 *  here we are using the dynamic manner hashmap You can change the word easily without changing banner logic.
 */
public class OOPSBannerApp {

    static Map<Character, String[]> getPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{//Stores each letter with its banner pattern
            " ******** ",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            " ******** "
        });

        map.put('P', new String[]{
            " ******** ",
            "*        *",
            "*        *",
            " ******** ",
            "*         ",
            "*         ",
            "*         "
        });

        map.put('S', new String[]{
            " ******** ",
            "*         ",
            "*         ",
            " ******** ",
            "         *",
            "         *",
            " ******** "
        });

        return map;
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = getPatterns();
        String word = "OOPS";

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                line.append(patterns.get(ch)[row]).append(" ");
            }
            System.out.println(line);
        }
    }
}
