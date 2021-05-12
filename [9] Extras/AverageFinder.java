import java.util.ArrayList;
import java.util.Scanner;

public class AverageFinder {

    private static ArrayList<Integer> collection = new ArrayList<Integer>();
    private static Scanner sc = new Scanner(System.in);
    private static int average = 0;

    public static void compute() {
        collection.forEach((k) -> average += k);
        average = average / collection.size();
    }

    public static void main(String[] args) {
        int count;

        System.out.println("How many numbers to enter?");
        count = sc.nextInt();
        System.out.println("Input:");

        for (int i = 0; i < count; i++) {
            collection.add(sc.nextInt());
            i++;
        }

        compute();

        System.out.println("Average is " + average);
        System.out.println("Numbers less than or equal to " + average);

        collection.forEach((k) -> {
            if (k <= average) {
                System.out.println(k);
            }
        });

    }
}