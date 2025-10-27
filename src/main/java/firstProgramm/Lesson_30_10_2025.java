package firstProgramm;

import java.util.Locale;

import static java.lang.Integer.compare;
import static java.lang.Integer.sum;

public class Lesson_30_10_2025 {
    public static void main(String[] args){
        //  простые/примитивные типы
        byte ageStudent = 127;
        System.out.println(ageStudent);

        short ageProfessor = 129;
        System.out.println(ageProfessor);

        boolean day = false;
        System.out.println(day);

        char symbol = 'f';
        System.out.println(symbol);

        float system = 3.4F;
        System.out.println(system);

        double pi = 3.14;
        System.out.println(pi);
        System.out.println();


        // ссылочные типы
        Integer f = 456;
        System.out.println(f);

        Integer f2 = 4;

        int c = Integer.MAX_VALUE;
        System.out.println(c);

        Integer f3 = sum(f, f2);
        System.out.println(f3);
        System.out.println(compare(f, f2));


        Cats_30_10_2025 kitty = new Cats_30_10_2025();
        kitty.name = "Musia";
        kitty.color = "black";
        kitty.age = 18;
        System.out.println("Имя кота: " + kitty.name + ", цвет: " + kitty.color + ", возраст: " + kitty.age);
        System.out.println();


        String lom = " hrgolhlogkdjfrgnhlftikjhlfgtohjtg ";
        System.out.println(lom);
        char xx = 'o';
        int x = lom.length();
        System.out.println("длинна моего слова равна - " + x);
        System.out.println(lom.indexOf(xx));
        System.out.println(lom.toUpperCase());
        System.out.println(lom.trim());

    }
}
