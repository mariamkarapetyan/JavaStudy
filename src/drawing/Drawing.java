package drawing;

public class Drawing {

    public static void main(String[] args) {
 //       drawRec(5,6);
        drawTriangleRightside(6,6);
        drawTriangle(6,6);
        triangle(5);
    }
    private static void drawRec(int row, int col){
        for (int i = 0; i< row; i++){
            for (int j = 0; j < col; j++){
                System.out.print( " *");
            }
            System.out.println();
        }
    }

    private static void drawTriangle(int row, int col){
        for (int i = 0; i < row ; i++){
            for (int j = 0; j < col; j++){
                System.out.print( " *");
            }
            col -= 1;
            System.out.println();
        }
    }

    private static void drawTriangleRightside(int row, int col){
        for (int i = 0; i < row ; i++){
            int j = 0;
            for (; j < col - i; j++){
                System.out.print( "  ");
            }
            for (; j < col; j++){
                System.out.print( " 6");
            }
            System.out.println();
        }
    }

    private static void triangle (int a){
        for (int i = 0; i < a; i++){
            for (int j = 0; j < i ; j++){
                System.out.print("-");
            }
            for (int j = 0; j < a - i ; j++){
                System.out.print("0");
            }
            System.out.println();
        }
    }


}
