import java.util.Scanner;

class Spiral {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;
        int filler = 0;
        int cycle = 0;

        while (arr[n / 2][n / 2] == 0) {
            for (int i = filler; i < n - cycle; i++) {
                arr[filler][i] = num;
                num++;
            }

            filler++;

            for (int j = filler; j < n - cycle; j++) {
                arr[j][n - filler] = num;
                num++;
            }

            for (int k = n - 1 - filler; k > cycle - 1; k--) {
                arr[n - filler][k] = num;
                num++;
            }

            cycle++;

            for (int l = n - 1 - filler; l > cycle - 1; l--) {
                arr[l][cycle - 1] = num;
                num++;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println("");
        }

    }
}
