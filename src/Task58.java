import java.util.Scanner;

public class Task58 {
    public static void main(String[] args){
        Scanner sc;
        int a;
        int b;

        sc = new Scanner(System.in);

        System.out.print("Введите число a >");
        a = sc.nextInt();

        System.out.print("Введите число b >");
        b = sc.nextInt();

        if(Math.pow(a, 2) > Math.pow(b, 2)){
            System.out.println("Наименьший из квадратов чисел a и b - квадрат числа b, равный " + Math.pow(b, 2));
        }else{
            System.out.println("Наименьший из квадратов чисел a и b - квадрат числа a, равный " + Math.pow(a, 2));
        }
    }
}
