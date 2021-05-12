package tictactoe;

import java.util.Scanner;

/**
 * The first project I made. Thanks to Jetbrains Academy I made something cool.
 * Check them out! https://hyperskill.org/.
 * 
 * @author Aldwin Dennis reyes
 */
public class Main {

    static int n = 3;
    static int X = 0;
    static int O = 0;
    static int coordsX = 0;
    static int coordsY = 0;
    static String takerX = "";
    static String takerY = "";
    static Scanner sc = new Scanner(System.in);
    static boolean turn = true;

    public static void main(String[] args) {
        // initialize variables and game array
        String dash = "---------";
        int result = 0;
        char[][] init = new char[n][n];
        boolean coords = true;

        // fills all array slots with underscore
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                init[i][j] = '_';
            }
        }

        System.out.println(dash);
        System.out.println("| " + init[0][0] + " " + init[0][1] + " " + init[0][2] + " |");
        System.out.println("| " + init[1][0] + " " + init[1][1] + " " + init[1][2] + " |");
        System.out.println("| " + init[2][0] + " " + init[2][1] + " " + init[2][2] + " |");
        System.out.println(dash);

        // note: X always comes first, then O. Use a boolean that alternates until a
        // player wins or the game ends.
        while (result == 0) {

            while (coords) {
                System.out.println("Enter the coordinates: ");
                takerX = sc.next().toLowerCase();
                takerY = sc.next().toLowerCase();
                coords = coordsCheck() || isDrawable(init);
            }

            if (turn) {
                init[coordsY][coordsX] = 'X';
                turn = false;
            } else {
                init[coordsY][coordsX] = 'O';
                turn = true;
            }
            System.out.println(dash);
            System.out.println("| " + init[0][0] + " " + init[0][1] + " " + init[0][2] + " |");
            System.out.println("| " + init[1][0] + " " + init[1][1] + " " + init[1][2] + " |");
            System.out.println("| " + init[2][0] + " " + init[2][1] + " " + init[2][2] + " |");
            System.out.println(dash);

            result = checker(init);
            coords = true;
        }

        switch (result) {
            case 1:
                System.out.println("X wins");
                break;
            case 2:
                System.out.println("O wins");
                break;
            case 3:
                System.out.println("Draw");
                break;
            case 4:
                System.out.println("Impossible");
                break;
            case 5:
                System.out.println("Game not finished");
                break;
            default:
                System.out.println("This is not supposed to show up, result var error");
                break;
        }
    }

    public static int checker(char[][] init) {
        int result = 0;
        boolean isBlank = false;
        boolean isDone = false;
        boolean winX = false;
        boolean winO = false;

        if (X - 2 >= O || O - 2 >= X) {
            result = 4;
            return result;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (init[i][j] == ' ') {
                    isBlank = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            if (isDone) {
                break;
            }

            for (int j = 0; j < n; j++) {

                if (init[i][j] == '_') {
                    isBlank = true;
                }

                if ((j == 0 && init[i][j] == 'X' && init[i][j + 1] == 'X' && init[i][j + 2] == 'X')
                        || (i == 0 && init[i][j] == 'X' && init[i + 1][j] == 'X' && init[i + 2][j] == 'X')) {
                    winX = true;
                } else if ((j == 0 && init[i][j] == 'O' && init[i][j + 1] == 'O' && init[i][j + 2] == 'O')
                        || (i == 0 && init[i][j] == 'O' && init[i + 1][j] == 'O' && init[i + 2][j] == 'O')) {
                    winO = true;
                } else if ((j == 2 && i == 0 && init[i][j] == 'X' && init[i + 1][j - 1] == 'X'
                        && init[i + 2][j - 2] == 'X')
                        || (i == 0 && j == 0 && init[i][j] == 'X' && init[i + 1][j + 1] == 'X'
                                && init[i + 2][j + 2] == 'X')) {
                    winX = true;
                } else if ((j == 2 && i == 0 && init[i][j] == 'O' && init[i + 1][j - 1] == 'O'
                        && init[i + 2][j - 2] == 'O')
                        || (i == 0 && j == 0 && init[i][j] == 'O' && init[i + 1][j + 1] == 'O'
                                && init[i + 2][j + 2] == 'O')) {
                    winO = true;
                } else {
                    continue;
                }
            }

        }

        if (winX && winO) {
            result = 4;
        } else if (winX) {
            result = 1;
        } else if (winO) {
            result = 2;
        } else if (winX == false && winO == false) {
            if (isBlank) {
                result = 0;
            } else {
                result = 3;
            }
        }

        return result;
    }

    public static boolean coordsCheck() {
        boolean askCoordsX = true;
        boolean askCoordsY = false;
        boolean errorChkX = false;
        boolean errorChkY = false;

        while (askCoordsX) {
            errorChkX = false;

            switch (takerX) {
                case "1":
                    coordsX = 0;
                    break;
                case "2":
                    coordsX = 1;
                    break;
                case "3":
                    coordsX = 2;
                    break;
                default:
                    errorChkX = true;
                    break;
            }

            if (errorChkX) {
                if (takerX.charAt(0) >= 30 && takerX.charAt(0) <= 39) {
                    System.out.println("Coordinates should be from 1 to 3");
                    return true;
                } else {
                    System.out.println("You should enter numbers");
                    return true;
                }
            } else {
                askCoordsX = false;
                askCoordsY = true;
            }

        }

        while (askCoordsY) {
            errorChkY = false;

            switch (takerY) {
                case "1":
                    coordsY = 2;
                    break;
                case "2":
                    coordsY = 1;
                    break;
                case "3":
                    coordsY = 0;
                    break;
                default:
                    errorChkY = true;
                    break;
            }

            if (errorChkY) {
                if (takerY.charAt(0) >= 30 && takerY.charAt(0) <= 39) {
                    System.out.println("Coordinates should be from 1 to 3");
                    return true;
                } else {
                    System.out.println("You should enter numbers");
                    return true;
                }
            } else {
                askCoordsY = false;
            }
        }

        return false;

    }

    public static boolean isDrawable(char[][] init) {
        if (init[coordsY][coordsX] == '_') {
            return false;
        } else {
            System.out.println("This cell is occupied! Choose another one!");
            return true;
        }
    }
}
