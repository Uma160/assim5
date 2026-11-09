import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int size = n;
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 0; i < size; ) {
                int j = i;
                while (j < size && arr[j] == arr[i]) {
                    j++;
                }

                if (j - i >= 3) {
                    int count = j - i;
                    for (int k = j; k < size; k++) {
                        arr[k - count] = arr[k];
                    }
                    size -= count;
                    changed = true;
                    i = 0;
                } else {
                    i = j;
                }
            }
        }

        System.out.println(n - size);
    }
}
