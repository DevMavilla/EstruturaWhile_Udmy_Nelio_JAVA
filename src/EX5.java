
import java.lang.Math;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        int x = 2;
        int y = 10;

        System.out.println("Olá");

        while (x < y) {
            System.out.println(x + "-" + y);
            x = x * 2;
            y = y + 1;
        }
        /*
        Programa sai automaticamente e se trocarmos o valor de X ele repete infinitamente.
         */
    }
}
