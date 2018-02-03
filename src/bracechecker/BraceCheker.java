package bracechecker;

public class BraceCheker {
    Stack stack;

    public BraceCheker() {
        this.stack = new Stack();
    }


    public void parse(String text) {
        for (int i = 0; i < text.length(); i ++){
            char ch = text.charAt(i);
            switch (ch){

                case '[':
                default:

            }
        }

    }
}
