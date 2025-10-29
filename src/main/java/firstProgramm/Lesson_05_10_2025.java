package firstProgramm;

public class Lesson_05_10_2025 {

    public static void countDown(int n){
        if (n == 0){
            System.out.println("Готово!!!");
        } else {
            System.out.println(n);
            countDown(n - 1);
        }
    }


    public static void main(String[] args){

        int x = 78;
        x = 76;
        System.out.println(x);

        final int y = 78;
        // y = 70;  // невозможно
        System.out.println(y);



        // массивы
        int[] num1;
        int num2[];

        num1 = new int[7];
        num1[0] = 65;
        // num1[1] = 15;
        num1[2] = 25;
        num1[3] = 35;
        num1[4] = 45;
        num1[5] = 55;
        num1[6] = 5;
        System.out.println(num1[1]);

        num2 = new int[7];
        int[] num4 = new int[]{8,23,45,0,0,0,0,24,54,63,85,98};
        int r = num4.length;
        System.out.println(r);



        // условные операторы
        int m = 12;
        boolean b = m > 0;

        if (b){
            if (m < 15){
                System.out.print("m меньше 15 ");
            }
            System.out.println("m больше 0");
        } else {
            System.out.println("m меньше 0");
        }

        int m2 = -10;   // укороченные запись
        String s = (m2>0) ? "m2 больше 0": "m2 меньше 0";
        System.out.println(s);
        int m3 = 10;
        System.out.println((m3>0) ? "m3 больше 0": "m3 меньше 0");


        // циклы
        for (int i = 2; i <= r-1; i=i+2){
            System.out.print(num4[i] + " ");
        }
        System.out.println();

        for (int i: num4){System.out.print(i + " ");}; // укороченная запись

        int cash = 100;
        while (cash >= 0){
            System.out.println("djnvfkdjnm");
            cash = cash - 20;
        }

        int cash2 = 0;
        do{
            System.out.println("35252");
            cash = cash -20;
        } while  (cash > 0);


        countDown(5);

    }
}




























