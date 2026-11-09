import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int uniqueCount = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] != array[i - 1]) {
                uniqueCount++;
            }
        }

        System.out.println(uniqueCount);
    }
}
