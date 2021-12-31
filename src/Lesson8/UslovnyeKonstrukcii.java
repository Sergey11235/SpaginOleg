package Lesson8;

public class UslovnyeKonstrukcii {
    public static void main(String[] args) {
      //  if () {...} else {...}
/*        int a = 300, b = 300, c = 800;
        if (a > b) {
            System.out.println("a > b");
            System.out.println("1 block");
            if (c > 500) System.out.println("c > 500");
        } else {
            System.out.println("a <= b");
            System.out.println("2 block else");
            if (c > 700) System.out.println("c > 700");
        }
    }*/
        int a = 400, b = 300, c = 800;
        if (a > b) {
            System.out.println("a > b");
         } else if (a < b){
            System.out.println("a < b");
        }  else if (a == b) {
            System.out.println("a == b");
        }

//        switch (){
//            case ...: ... break;
//            case ...: ... break;
//            case ...: ... break;
//            default: ...
//        }

//        for (int i = 0; i < 6; i++) {
//            switch (i) {
//                case 0: System.out.println("i < 0");
//                case 1: System.out.println("i < 1");
//                case 2: System.out.println("i < 2");
//                case 3: System.out.println("i < 3");
//                case 4: System.out.println("i < 4");
//                case 5: System.out.println("i < 5");
//
//            }
//            System.out.println();
//        }
        switch (a) {
            case 300:
                System.out.println("a == 300");
                System.out.println("a равно 300");
                break;

            case 400:
                System.out.println("a == 400");
                System.out.println("a равно 400");
                break;

        }
    }

}
