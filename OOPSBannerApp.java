/**
 * OOPSBannerApp UC4 – OOPS Banner Application (Use Case 4)
 *
 * This version improves UC3 by storing banner lines
 * inside a String array and printing them using a loop,
 * improving modularity and reducing repetition.
 *
 * @author dishaun
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] bannerLines = {

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        " ******* ",
                        " ******* "
                ),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * "
                ),

                String.join(" ",
                        "*       *",
                        "*       *",
                        "*       *",
                        "*       "
                ),

                String.join(" ",
                        "*       *",
                        "*       *",
                        "*******  ",
                        " ******  "
                ),

                String.join(" ",
                        "*       *",
                        "*       *",
                        "*        ",
                        "       * "
                ),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        "*        ",
                        "*      * "
                ),

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        "*        ",
                        " ******  "
                )
        };

        // Enhanced for loop to print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}