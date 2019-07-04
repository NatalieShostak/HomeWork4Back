import java.util.Scanner;

public class Task7 {
    public static void count(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(i + 1);
        }
    }

    public static void drawRectangle(int width, int height) {
        for (int j = 1; j <= height; j++) {
            for (int i = 1; i <= width; i++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int width) {
        drawRectangle(width, width);
    }

    public static void getMax(int a, int b) {
        int max = Math.max(a, b);
        System.out.println("Max value of two int's is " + max);
    }

    public static void getMax(float a, float b) {
        float max = Math.max(a, b);
        System.out.println("Max value of two float's is " + max);
    }

    public static void countRecursion(int x) {
        if (x == 0) return;
        else {
            countRecursion(x - 1);
            System.out.println(x);
        }
    }

    public static void drawPartOfRectangleRecursion(int a) {
        if (a == 0) return;
        else {
            drawPartOfRectangleRecursion(a - 1);
            System.out.print("+");
        }
    }

    public static void drawRectangleRecursion(int width, int height) {
        if (height == 0) return;
        else {
            drawPartOfRectangleRecursion(width);
            System.out.println();
            drawRectangleRecursion(width, height - 1);
        }
    }

    public static void whichTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which task should I do?\n(input number 1 - 6)");
        int taskNumber = sc.nextInt();

        switch (taskNumber) {
            case 1:
                System.out.println("Enter number to count");
                int value = sc.nextInt();
                count(value);
                break;
            case 2:
                System.out.println("Enter the width of rectangle");
                int width = sc.nextInt();
                System.out.println("Enter the height of rectangle");
                int height = sc.nextInt();
                drawRectangle(width, height);
                break;
            case 3:
                System.out.println("Enter the width of the square");
                int widthOfSquare = sc.nextInt();
                drawRectangle(widthOfSquare);
                break;
            case 4:
                getMax(2, 93);
                break;
            case 5:
                countRecursion(8);
                break;
            case 6:
                drawRectangleRecursion(2, 4);
                break;
            default:
                System.out.println("incorrect number");
        }
    }

    public static void again() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to do another task?\n(yes/no)");
        String answer = sc.nextLine();

        if (answer.equals("yes")) {
            whichTask();
            again();
        } else System.out.println("as you wish");
    }

    public static void main(String[] args) {
        whichTask();
        again();
    }
}


