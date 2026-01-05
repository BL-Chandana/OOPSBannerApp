/**
 * UC7: Banner using Inner Class
 * Now it uses an Inner Class (CharacterPattern) to store each letter and its pattern.
 */
public class OOPSBannerApp {

    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{//Create Objects for Each Letter
            " ******** ",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            " ******** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            " ******** ",
            "*        *",
            "*        *",
            " ******** ",
            "*         ",
            "*         ",
            "*         "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            " ******** ",
            "*         ",
            "*         ",
            " ******** ",
            "         *",
            "         *",
            " ******** "
        });

        for (int i = 0; i < 7; i++) {
            System.out.println(String.join(" ",
                    O.getPattern()[i],
                    O.getPattern()[i],
                    P.getPattern()[i],
                    S.getPattern()[i]));
        }
    }
}
