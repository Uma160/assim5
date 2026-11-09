import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int maks =0;
        for (int i=0;i<n;i++){
            if (array[i]>maks){
                maks = array[i];
            }
        }

        System.out.println(maks);
    }
}
