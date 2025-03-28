import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        Scanner sc;
        int x;
        sc = new Scanner(System.in);
        System.out.print("> ");
        x = sc.nextInt();
        //scanner.close();

        if(x<3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
