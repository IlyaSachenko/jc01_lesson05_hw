import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        Scanner sc;
        int a;
        int b;
        int c;
        int x;
        int rez;

        sc = new Scanner(System.in);

        System.out.print("Введите число a >");
        a = sc.nextInt();

        System.out.print("Введите число b >");
        b = sc.nextInt();

        System.out.print("Введите число c >");
        c = sc.nextInt();

        System.out.print("Введите число x >");
        x = sc.nextInt();

        rez = Math.abs((a * x * x) + (b * x) + c);
        System.out.println("Модуль выражения (a*x*x + b*x + c) равен: " + rez);
     }
}