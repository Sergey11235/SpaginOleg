package Operators;

public class Operators {
    public static void main(String[] args) {
        // Арифметические операторы
//        int a = 200, b = 20, c;
//        c = a + b;
//        a++; b--;
//        ++a; --b;
//        System.out.println("a++ = " +(a++)+" b-- = "+ (b--));
//        System.out.println("a = " +a+" b = "+ b);
//        a = 200; b = 20;
//        System.out.println("++a = " + (++a)+" --b = "+ (--b));
//        System.out.println("a = " +a+" b = "+ b);
        // Логические операции
//        boolean a, b;
//        a = false; b = true;
//        System.out.println("a="+a+" b="+b+" a&b="+(a&b));
//        System.out.println("a="+a+" b="+b+" a|b="+(a|b));
//        System.out.println("a="+a+" b="+b+" a^b="+(a^b));
//        System.out.println("a="+a+" b="+b+" !a="+(!a));
//        // Укороченные логические операторы (ИЛИ ||) (&& И)
//        int n = 10; int d = 2;
//        if (d != 0 && (n%d)==0)
//            System.out.println("d делитель для n!");
        // Операторы сравнения
//        int d = 200, h = 400, k = 500;
//        System.out.println("d == h "+(d == h));
//        System.out.println("d != h "+(d != h));
//        System.out.println("d > h "+(d > h));
//        System.out.println("d < h "+(d < h));
//        System.out.println("d < h < k "+(d < h & h < k));
//        System.out.println("d >= h "+(d >= h));
//        System.out.println("d <= h "+(d <= h));
        // Побитовые операции ^ (XOP), | (дизъюнкция), & (коньюнкция), ~ (дополнение)
        byte b1 = 0b1010, b2 = 0b1101, b3 = 0b1000;
        System.out.println("b1 = "+b1 +" b2 = "+b2+" b3 = "+b3);
        System.out.println("b1&b2 = "+(b1&b2) +" b2 | b1 = "+(b2|b1));
    }

}

