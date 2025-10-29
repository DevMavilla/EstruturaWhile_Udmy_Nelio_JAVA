
import java.lang.Math;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {

        int x = 4;
        int y = 0;
        int i = 0;

        while (i < x) {
            i = i + 1;
            y = y + i;
            System.out.println(i);
            System.out.println(y);
        }
        /*
        1
        1
        2
        3
        3
        6
        4
        10
         */
    }
}
