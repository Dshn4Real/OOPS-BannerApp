/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class improves UC2 by using String.join() instead of
 * string concatenation with + operator for better efficiency
 * and readability.
 *
 * @author dishaun
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                "  *****  ",
                "  *****  ",
                " ******* ",
                " ******* "
        ));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * "
        ));

        System.out.println(String.join(" ",
                "*       *",
                "*       *",
                "*       *",
                "*       "
        ));

        System.out.println(String.join(" ",
                "*       *",
                "*       *",
                "*******  ",
                " ******  "
        ));

        System.out.println(String.join(" ",
                "*       *",
                "*       *",
                "*        ",
                "       * "
        ));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                "*        ",
                "*      * "
        ));

        System.out.println(String.join(" ",
                "  *****  ",
                "  *****  ",
                "*        ",
                " ******  "
        ));
    }
}
