/**
 * OOPSBannerApp UC4 – OOPS Banner using Array and Loop
 *
 * Stores banner lines in a String array and
 * prints them using an enhanced for loop.
 *
 * @author dishaun
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to store all 7 banner lines
        String[] banner = new String[7];

        banner[0] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " ******* ",
                " ******* ");

        banner[1] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ");

        banner[2] = String.join(" ",
                "*       *",
                "*       *",
                "*       *",
                "*        ");

        banner[3] = String.join(" ",
                "*       *",
                "*       *",
                "*******  ",
                " ******  ");

        banner[4] = String.join(" ",
                "*       *",
                "*       *",
                "*        ",
                "       * ");

        banner[5] = String.join(" ",
                " *     * ",
                " *     * ",
                "*        ",
                "*      * ");

        banner[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                "*        ",
                " ******  ");

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}