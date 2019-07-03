public class Task2 {
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

    public static void main(String[] args) {
        drawRectangle(3, 2);
        drawRectangle(5);
    }
}
