import java.util.Scanner;

/**
 *
 * @author rriverag
 */
public class Nth {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long n = entrada.nextLong();
        long a;
        long b;
        long c;
        int i = 0;
        int j = 2;
        while (i<n){
         a = entrada.nextLong();
         c = entrada.nextLong();
         if ( a > c){
           long temp = c;
           c = a;
           a = temp;
         }
          while (j <= 10){
            b = entrada.nextLong();
            if (b > a && b < c){
              c = b;
            } else if (a > b){
              c = a;
              a = b;
            }
            j++;
          }
          System.out.println(c);
          i++;
          j = 2;
        }
    }
}
