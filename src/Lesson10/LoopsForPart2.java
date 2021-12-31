package Lesson10;

public class LoopsForPart2 {
    public static void main(String[] args) {
/*        int i=0, j=10;
        for (; i<j; i++, j--) {
            System.out.println("i="+i+" j="+j);*/
/*        int i=0;
        for (;;) {
            i++;
            if (i>10) break;
            System.out.println("i="+i);
        }*/
        int sum = 0;
        for (int i=0; i<10; i++, sum+=i);
        System.out.println("sum="+sum);
    }
}
