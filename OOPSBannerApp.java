/**
 * UC5: Inline Array Initialization
 * UC5 stores all banner rows together in an array and prints them using a loop.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", " ******** ", " ******** ", " ******** ", " ******** "),
            String.join(" ", "*        *", "*        *", "*        *", "*         "),
            String.join(" ", "*        *", "*        *", "*        *", "*         "),
            String.join(" ", "*        *", "*        *", " ******** ", " ******** "),
            String.join(" ", "*        *", "*        *", "*         ", "        * "),
            String.join(" ", "*        *", "*        *", "*         ", "        * "),
            String.join(" ", " ******** ", " ******** ", "*         ", " ******** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
