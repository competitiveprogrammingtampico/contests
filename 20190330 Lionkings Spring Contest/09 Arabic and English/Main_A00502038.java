aimport java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        scanner.reset();

        for (int t = 0; t < T; t++) {
            ArrayList<String> before = new ArrayList<>();
            ArrayList<String> after = new ArrayList<>();
            String english = "";
            int N = scanner.nextInt();
            scanner.reset();

            String line = scanner.nextLine();
            line = scanner.nextLine();
            String sentence[] = line.split(" ");
            for (String word : sentence) {
                if (word.charAt(0) == '#') {
                    if (english.equals("")) {
                        before.add(word);
                    } else {
                        after.add(word);
                    }
                } else {
                    english = word;
                }
            }

            if (english.equals("")) {
                System.out.println(line);
            } else {
                StringBuilder string = new StringBuilder();
                for (String word : after) {
                    string.append(word);
                    string.append(" ");
                }
                string.append(english);
                string.append(" ");
                for (String word : before) {
                    string.append(word);
                    string.append(" ");
                }
                System.out.println(string.toString().trim());
            }
        }
    }
}
