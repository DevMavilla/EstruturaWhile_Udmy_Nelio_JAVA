import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {

        int x = 5;
        int y = 0;

        while(x > 2 ) {
            System.out.println(x);
            y = y + x;
            x = x - 1;
        }
        /*

        O saida é:

        5
        4
        3

        */
    }
}
