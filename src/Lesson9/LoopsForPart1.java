package Lesson9;

public class LoopsForPart1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // for (инициализаация; условие;итерация) инструкция;
        // for (инициализаация; условие;итерация) {
        //      инструкция; инструкция; инструкция;
        //   }

            for (int i=0, j=10; i<j; i++, j--) {
                System.out.println("i="+i+" j="+j); // в большинстве случаев такой подход не используют
/*                System.out.println("i^2="+i*i);
                // Циклы можно делать вложенными
                for (int j=0; j<5; j++) System.out.print(" j*i="+j*i);
                System.out.println();*/
            }

    }
}
