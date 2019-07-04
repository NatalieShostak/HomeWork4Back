public class Task5 {
    public static void countRecursion(int x) {
        if (x == 0) return;
        else {
            countRecursion(x - 1);
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        countRecursion(4);
    }
}
