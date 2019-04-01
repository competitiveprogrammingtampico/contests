import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        array.add(scanner.nextInt());
        array.add(scanner.nextInt());
        array.add(scanner.nextInt());
        Collections.sort(array);
        a = array.get(0);
        b = array.get(1);
        c = array.get(2);
        
        System.out.println((a+b > c)?a+b:c);
    }
    
}
