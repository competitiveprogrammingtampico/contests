import java.util.Scanner;

/**
 *
 * @author rriverag
 */

public class KLC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long cases = entrada.nextLong();
        long a;
        long b;
        long c;
        int count = 0;
        int i = 0;
        while (i<cases){
            a = entrada.nextLong();
            b = entrada.nextLong();
            for (int j = 0;i<a;j++){
              long amount = entrada.nextLong();
              while (amount >= b){
                amount -= b;
                count++;
              }
            }
            System.out.println(count);
            count = 0;
            i++;
        }
    }
}
