/**
 * UC6: Banner using Functions
 * now we are using functions (methods) to generate the pattern of each letter.
 */
public class OOPSBannerApp {

    static String[] getOPattern() {
        return new String[]{
            " ******** ",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            "*        *",
            " ******** "
        };
    }

    static String[] getPPattern() {
        return new String[]{
            " ******** ",
            "*        *",
            "*        *",
            " ******** ",
            "*         ",
            "*         ",
            "*         "
        };
    }

    static String[] getSPattern() {
        return new String[]{
            " ******** ",
            "*         ",
            "*         ",
            " ******** ",
            "         *",
            "         *",
            " ******** "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();//call back functions
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < 7; i++) {
            System.out.println(String.join(" ", o[i], o[i], p[i], s[i]));
        }
    }
}
