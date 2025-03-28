import java.util.Scanner;

public class Task510 {
    public static void main(String[] args) {

        Scanner sc;
        int r1;
        int r2;
        double s1;
        double s2;

        sc = new Scanner(System.in);

        System.out.print("Введите радиус первого круга r1 >");
        r1 = sc.nextInt();

        System.out.print("Введите радиус второго круга r2 >");
        r2 = sc.nextInt();

        s1 = Math.PI * Math.pow(r1, 2);
        s2 = Math.PI * Math.pow(r2, 2);

        if (s1 > s2) {
            System.out.println("Площадь круга №1 больше площади круга №2");
        } else {
            System.out.println("Площадь круга №2 больше площади круга №1");
        }
    }
}
