import java.util.Scanner;

public class Task1 {

    public static void count() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println(i + 1);
        }
    }

    public static void main(String[] args) {
        count();
    }
}
