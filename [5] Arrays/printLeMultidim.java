import java.util.Scanner;

class printLeMultidim {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input multidim array height: ");
        int n = sc.nextInt();

        System.out.print("Input multidim array width: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int[] arr2 : arr) {
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }
        }

        for (int[] arr2 : arr) {
            for (int num : arr2) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }
}
