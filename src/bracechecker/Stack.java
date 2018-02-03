package bracechecker;


public class Stack {
    public static final char DEFAULT_CAPACITY = 10;

    private char[] values;
    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(char size){
        values = new char[size];
        tos = -1;
    }
    public char pop (){
        if(tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return values[tos--];
    }

    public void push (char val) {
        if (tos == values.length - 1){
            System.out.println("Stack is full");
        }
        values [++tos] = val;
    }
}
