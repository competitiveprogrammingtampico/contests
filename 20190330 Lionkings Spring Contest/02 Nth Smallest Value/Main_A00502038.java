import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int T;
        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();

        scanner.reset();

        for (int t = 0; t < T; t++) {
            ArrayList<Integer> array = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                array.add(scanner.nextInt());
            }
            Collections.sort(array);
            System.out.println(array.get(1));
        }

        scanner.reset();
    }
}
