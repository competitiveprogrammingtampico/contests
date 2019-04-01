import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rriverag
 */

  public class MAX {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          ArrayList list = new ArrayList();
          int i = 0;
          while(i<3){
            list.add(entrada.nextLong());
            i++;
          }
          Collections.sort(list);
          long g = (long)list.get(2);
          long r = (long)list.get(0) + (long)list.get(1);
          if ( r > g){
            System.out.println(r);
          } else {
            System.out.println(g);
          }
      }
  }
