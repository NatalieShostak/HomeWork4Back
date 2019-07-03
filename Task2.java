public class Task2 {
    public static void drawRectangle (int width,int height){
       for (int j = 0; j <= height-1; j++) {
           for (int i = 0; i <= width-1; i++) {
               System.out.print("+");
           }
           System.out.println();
       }
    }

    public static void drawRectangle (int width) {
        drawRectangle(width, width);
    }

    public static void main(String[] args) {
        drawRectangle(3, 2);
        drawRectangle(5);
    }
}
