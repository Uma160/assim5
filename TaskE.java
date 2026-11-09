import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        boolean hasSameSignPair = false;
        for (int i = 1; i < n; i++) {
            if ((array[i] > 0 && array[i - 1] > 0) || (array[i] < 0 && array[i - 1] < 0)) {
                hasSameSignPair = true;
                break;
            }
        }

        if (hasSameSignPair) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
