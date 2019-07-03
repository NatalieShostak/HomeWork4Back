public class Task4 {
    public static void getMax (int a, int b){
        int max = Math.max(a,b);
        System.out.println("Max value of two int's is " + max);
    }

    public static void getMax (float a, float b){
        float max = Math.max(a,b);
        System.out.println("Max value of two float's is " + max);
    }

    public static void main(String[] args) {
        getMax(8, 8);
        getMax(8.5f, 0.8f);
    }
}
