public class Cycle5 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 99 && x % 2 != 0) {
            //if (x % 2 != 0) {
            sum = sum + x;
            x++;
            //}
        }
        System.out.println("Сумма нечетных чисел от 1 до 99 равна " + sum);
    }
}
