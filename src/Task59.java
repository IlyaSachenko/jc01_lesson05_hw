import java.util.Scanner;

public class Task59 {
    public static void main(String[] args) {

        Scanner sc;
        int a;
        int b;
        int c;

        sc = new Scanner(System.in);

        System.out.print("Введите длину стороны треугольника a >");
        a = sc.nextInt();

        System.out.print("Введите длину стороны треугольника b >");
        b = sc.nextInt();

        System.out.print("Введите длину стороны треугольника c >");
        c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Треугольник является равносторонним");
        } else {
            System.out.println("Треугольник не является равносторонним");
        }
    }
}

