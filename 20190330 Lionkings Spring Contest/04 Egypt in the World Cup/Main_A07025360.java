import java.util.Scanner;

/**
 *
 * @author rriverag
 */

class EGY {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    long a = entrada.nextLong();
    long b;
    String s;
    long c;
    String s2;
    long c2;
    long r = 0;
    for (int i = 0; i < a; i++){
      b = entrada.nextLong();
      s = entrada.next();
      c = entrada.nextLong();
      for(int j = 1; j < b; j++){
        s2 = entrada.next();
        c2 = entrada.nextLong();
        if (c2 > c){
          c = c2;
          s = s2;
        }
      }
      System.out.println(s);
    }
  }
}