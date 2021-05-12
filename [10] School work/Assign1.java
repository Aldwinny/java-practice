import javax.swing.JOptionPane;

/**
 * Write a program using {@code JOptionPane} that will let the user enter 3
 * numbers then choose what operation will be performed using case switch.
 * 
 * @author Aldwin Dennis L. Reyes
 */
public class Assign1 {

    private static final String TITLE = "App";

    public static void main(String args[]) {
        // Initialize Variables
        int choice = 0;
        String temp;
        int num1, num2, num3;

        // Entry point of the application
        do {
            // Asks for the number
            temp = displayAsQuestion("Please input the first number", TITLE);
            if (tryParseInt(temp)[0] == 0) {
                displayAsError("Number input error!", TITLE);
                continue;
            }
            num1 = tryParseInt(temp)[1];

            temp = displayAsQuestion("Please input the second number", TITLE);
            if (tryParseInt(temp)[0] == 0) {
                displayAsError("Number input error!", TITLE);
                continue;
            }
            num2 = tryParseInt(temp)[1];

            temp = displayAsQuestion("Please input the third number", TITLE);
            if (tryParseInt(temp)[0] == 0) {
                displayAsError("Number input error!", TITLE);
                continue;
            }
            num3 = tryParseInt(temp)[1];

            do {
                do {
                    choice = tryParseInt(displayAsQuestion(
                            "Please choose your transaction!\n[1] Average of three numbers\n[2] Lowest number\n[3] Product of all numbers\n[4] Exit App",
                            "Welcome!"))[1];
                } while (choice <= 0 || choice > 4);

                switch (choice) {
                    case 1:
                        // The computation of average happens at the line itself.
                        displayAsInfo("The average of all three numbers is " + (num1 + num2 + num3) / 3, TITLE);
                        break;
                    case 2:
                        // The computation of minimum number happens at the line itself.
                        displayAsInfo("The lowest number is " + Math.min(Math.min(num1, num2), num3), TITLE);
                        break;
                    case 3:
                        // The computation of product happens at the line itself.
                        displayAsInfo("The product is " + num1 * num2 * num3, TITLE);
                        break;
                    case 4:
                        // Exits the app
                        System.exit(0);
                        break;
                    default:
                        // Continues to the query of whether user will reopen the application
                        continue;
                }
            } while (displayWithQuery("Continue?", TITLE, JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == 0);

            // Resets the value of the variables.
            num1 = 0;
            num2 = 0;
            num3 = 0;
        } while (displayWithQuery("Would you like to rerun the application?", TITLE, JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
    }

    /**
     * This method attempts to parse an {@code Integer} from the input string.
     * 
     * @param string the {@code String} to be parsed.
     * @return If the integer is properly parsed by {@code Integer.parseInt(string)}
     *         then it will return an int array size 2 with the first number
     *         containing 1 and the second number the parsed number. Otherwise it
     *         will return an array both with 0.
     */
    public static int[] tryParseInt(String string) {
        try {
            return new int[] { 1, Integer.parseInt(string.trim()) };
        } catch (NumberFormatException e) {
            return new int[] { 0, 0 };
        } catch (NullPointerException n) {
            System.exit(0);

        }
        return new int[] {};
    }

    /**
     * This method displays a message as an error message using
     * {@code JOptionPane.showMessageDialog}. This method is made to simplify the
     * parameters and to make the code more readable.
     * 
     * @param message The message to be displayed.
     * @param title   The title of the option pane.
     */
    public static void displayAsError(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);

    }

    /**
     * This method displays a message as an information message using
     * {@code JOptionPane.showMessageDialog}. This method is made to simplify the
     * parameters and to make the code more readable.
     * 
     * @param message The message to be displayed.
     * @param title   The title of the option pane.
     */
    public static void displayAsInfo(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * This method displays a message as a question using
     * {@code JOptionPane.showMessageDialog}. It returns a {@code String} from the
     * input dialog. This method is made to simplify the parameters and to make the
     * code more readable.
     * 
     * @param message the message to be displayed.
     * @param title   the title of the option pane.
     * @return {@code String} Input of the user.
     */
    public static String displayAsQuestion(String message, String title) {
        return (String) JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, null,
                null);
    }

    /**
     * This method displays a message that allows simple query response using
     * {@code JOptionPane.showMessageDialog}. It returns an {@code Integer}
     * depending on the option dialog. This method is made to simplify the
     * parameters and to make the code more readable.
     * 
     * @param message     the message to be displayed.
     * @param title       the title of the option pane.
     * @param optionType  the type of option used.
     * @param messageType the type of message.
     * @return {@code Integer} that depends on the {@code optionType} but usually
     *         ranges from 0 to 2
     */
    public static int displayWithQuery(String message, String title, int optionType, int messageType) {
        return JOptionPane.showOptionDialog(null, message, title, optionType, messageType, null, null, null);
    }
}
