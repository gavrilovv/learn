import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
            int x = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

        if (x > a)
            out.print(0);
        else if (x > b)
            out.print(1);
        else if (x > c)
            out.print(2);
        else if (x > d)
            out.print(3);
        else
            out.print(4);
     }
}
