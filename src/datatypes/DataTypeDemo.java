package datatypes;


import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Queue;

public class DataTypeDemo {

    public static void main(String[] args) {

        byte[] bytes = intToByte(234347766);
        Integer[][][] ar = new Integer [4][3][3];
        print(ar);

        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new Integer[i+1][];
            for (int j = 0; j <ar [i].length ; j++) {
                ar[i][j] = new Integer[ar[i].length];
                for (int k = 0; k < ar[i][j].length ; k++) {
                    ar[i][j][k] = i + j + k;
                }
            }
        }
        print(ar);
    }

    static <T> void print(T[][][] a ){
        for (int i = 0; i < a.length; i++) {
            print(a[i]);
            System.out.println();
        }
    }
    static <T> void print(T[][] a ){
        for (int i = 0; i < a.length; i++) {
            print(a[i]);
        }
    }

    static <T> void print(T[] a) {
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static byte[] intToByte(int a){
        byte[] result = new byte[4];
        for (int i = 24, j = 0; i >= 0; i -= 8, j++) {
            result[j] = (byte)(a >> i);
        }
        return result;
    }

    public static void byteDemo() {
        byte  b = 0x10;
        byte  a = 1;
        byte  c = (byte) (b + a);
    }

    public static void shortDemo() {

    }

    public static void charDemo() {

        char ch = '\uffff';
        char ch1 = '8';
        byte i = 1;
        ch1 = (char) i;

    }

    public static void intDemo() {

    }

    public static void longDemo() {

        int i = 7;
        long l = 9;
        long l1 = i + l;
        int i1 = (int) (i + l);
    }

    public static void floatDemo() {

        float f = 0.2f;
        long l = 3;

    }

    public static void doubleDemo() {

    }

    public static void booleanDemo() {

        boolean boll = true; // false
        byte  b = 0x10;
        byte  a = 1;
//        if(a = b){
//
//        }
    }

}
