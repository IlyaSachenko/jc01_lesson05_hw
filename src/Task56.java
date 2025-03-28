import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        Scanner sc;
        int a;
        int b;

        sc = new Scanner(System.in);

        System.out.print("Введите число a >");
        a = sc.nextInt();

        System.out.print("Введите число b >");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("Число a наибольшее");
        } else if (b > a) {
            System.out.println("Число b наибольшее");
        } else {
            System.out.println("Числа равны");
        }
    }
}
