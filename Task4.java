public class Task4 {
    public static void getMax(int a, int b) {
        int max;
        if (a > b) max = a;
        else max = b;
        System.out.println("Max value of two int's is " + max);
    }

    public static void getMax(float a, float b) {
        float max;
        if (a > b) max = a;
        else max = b;
        System.out.println("Max value of two float's is " + max);
    }

    public static void main(String[] args) {
        getMax(6, 25);
        getMax(8.5f, 125.8f);
    }
}
