import java.util.Scanner;

public class Task7 {
    public static void count (int x){
        for (int i=0; i<x;i++){
            System.out.println(i+1);
        }
    }

    public static void drawRectangle (int width,int height){
        for (int j=1; j<=height; j++) {
            for (int i = 1; i <= width; i++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void drawRectangle (int width){
        for (int j=1; j<=width; j++){
            for (int i=1; i<=width; i++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void getMax (int a, int b){
        int max = Math.max(a,b);
        System.out.println("Max value of two int's is " + max);
    }

    public static void getMax (float a, float b){
        float max = Math.max(a,b);
        System.out.println("Max value of two float's is " + max);
    }

    public static void countRecursion (int x) {
        if (x == 0) return;
        else {
            countRecursion(x - 1);
            System.out.println(x);
        }
    }

    public static void drawPartOfRectangleRecursion (int a){
        if (a == 0 ) return;
        else {
            drawPartOfRectangleRecursion(a-1);
            System.out.print("+");
        }
    }

    public static void drawRectangleRecursion (int width,int height){
        if (height == 0) return;
        else {
            drawPartOfRectangleRecursion(width);
            System.out.println();
            drawRectangleRecursion(width,height-1);
        }
    }

    public static void whichTask (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which task should I do?\n(input number 1 - 6)");
        int taskNumber = sc.nextInt();

        switch (taskNumber){
            case 1:
                count(5);
                break;
            case 2:
                drawRectangle(3,4);
                break;
            case 3:
                drawRectangle(5);
                break;
            case 4:
                getMax(2,93);
                break;
            case 5:
                countRecursion(8);
                break;
            case 6:
                drawRectangleRecursion(2,4);
                break;
            default:
                System.out.println("incorrect number");
        }
    }

    public static void again (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to do another task?\n(1-yes/2-no)");
        int answer = sc.nextInt(); //хз, почему-то не работает через string

        if (answer == 1) {
            whichTask();
            again();
        }
        else System.out.println("as you wish");
    }

    public static void main(String[] args) {
        whichTask();
        again();
    } // вопросы: 1)почему не работает scanner через string; 2) можно ли параметр передавать через консоль?
}


