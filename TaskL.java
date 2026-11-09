import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int petyaHeight = scanner.nextInt();

        int position = 1;
        for (int i = 0; i < n; i++) {
            if (array[i] >= petyaHeight) {
                position++;
            } else {
                break; //потому что они отсортированы и след будут ниже
            }
        }

        System.out.println(position);
    }
}
