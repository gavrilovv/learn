import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);

    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // считываем числа от пользователя
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        // проверяем через какое количество отверстий можно протащить шар
        if (x > a)
            //если диаметр первого отверстия меньше диаметра шара
            out.print(0);
        else if (x > b)
            //если диаметр второго отверстия меньше диаметра шара
            out.print(1);
        else if (x > c)
            //если диаметр третьего отверстия меньше диаметра шара
            out.print(2);
        else if (x > d)
            //если диаметр четвёртого отверстия меньше диаметра шара
            out.print(3);
        else
            // шар прошёл через все отверстия
            out.print(4);
     }
}
