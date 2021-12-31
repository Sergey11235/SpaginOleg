package Lesson11;

public class LoopsWhile {
    public static void main(String[] args) {
        System.out.println("Hello World!");
/*        while (условие) инструкция;
        while (условие) {
            инструкция; инструкция; инструкция ;
        }*/
/*        int i = 20, j = 0;
        while (i>10) {
            i--;
            System.out.println("i="+i);
            j = 0;
            while (j < 10) {
                j++;
                System.out.print(" j="+j);
            }
            System.out.println();
        }*/

//        do инструкция; while (условие);
//        do {
//            инструкция; инструкция; инструкция; инструкция;
//        } while (условие)
//
        int i = 10;
        do {
            i++;
            System.out.println("i="+i);
        } while (i<10);
/*        i = 10;
        while (i<10) {
            i++;
            System.out.println("i="+i);
        }*/
    }
}
