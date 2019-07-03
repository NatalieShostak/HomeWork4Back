public class Task6 {
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

    public static void main(String[] args) {
        drawRectangleRecursion(2,4);
    }
}


