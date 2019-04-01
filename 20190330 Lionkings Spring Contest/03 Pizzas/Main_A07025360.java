import java.util.Scanner;

/**
 *
 * @author rriverag
 */

class ZZA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long a = entrada.nextLong();
        long b;
        long c;
        long r = 0;
        for (int i = 0; i < a; i++){
          b = entrada.nextLong();
          for(int j = 0; j < b; j++){
            c = entrada.nextLong();
            r += c;
          }
          System.out.println("Case " +(i+1) + ": " + r);
          r = 0;
        }
    }
}