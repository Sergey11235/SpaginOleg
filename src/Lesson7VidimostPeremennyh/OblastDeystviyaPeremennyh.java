package Lesson7VidimostPeremennyh;

public class OblastDeystviyaPeremennyh {
    public static void main(String[] args) {
        int var1 = 100;

        if (var1 == 100) {

            int var2 = 200;
            System.out.println("var1="+var1+" var2="+var2);
        }

        for(int i=0; i<3; i++){
            int var3 = 333;
            System.out.println("var1="+var1+" var3="+var3+" i="+i);
            var3 = 555;
            System.out.println("var1="+var1+" var3="+var3+" i="+i);

        }
        // System.out.println("var1="+var1+" i="+i);
    }
}
