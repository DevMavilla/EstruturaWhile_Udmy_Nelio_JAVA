
import java.lang.Math;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

       double x = 100;
       double y = 100;

        while (x != y) {
            System.out.println("olha");
            x = Math.sqrt(y);
        }
        /*
        Programa sai automaticamente e se trocarmos o valor de X ele repete infinitamente.
         */
    }
}
