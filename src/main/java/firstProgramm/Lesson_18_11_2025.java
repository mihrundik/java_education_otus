package firstProgramm;

import java.util.*;

public class Lesson_18_11_2025 {
    public static void main(String[] args){

        // коллекция List
        List<String> fructs = new ArrayList<>();
        fructs.add("Apple");
        fructs.add("Banana");
        fructs.add("Cherry");
        fructs.add("Orange");

        System.out.println("третий элемент " + fructs.get(2));

        fructs.set(2, "Mango");
        System.out.println("третий элемент " + fructs.get(2));

        System.out.println("содержит ли список бананы? " + fructs.contains("Banana"));

        System.out.println("размер коллекции " + fructs.size());

        System.out.println(fructs);

        //коллекция linkedList(добавление в начало и конец)

        // коллекция Set
        Set<String> fructs2 = new HashSet<>();
        fructs2.add("Apple");
        fructs2.add("Banana");
        fructs2.add("Cherry");
        fructs2.add("Orange");
        fructs2.add("Orange");
        System.out.println(fructs2);

        // структура Map
        Map<Integer, String> fructs3 = new HashMap<>();
        fructs3.put(1, "Apple");
        fructs3.put(2, "Banana");
        fructs3.put(3, "Cherry");
        fructs3.put(4, "Orange");
        fructs3.put(5, "Orange");
        fructs3.put(6, "Orange");
        fructs3.put(6, "Mango");
        fructs3.putIfAbsent(6, "Apple");
        fructs3.putIfAbsent(5, "Red Apple");
        System.out.println(fructs3);
        System.out.println("поиск по ключу 6 " + fructs3.get(6));
        System.out.println(fructs3.containsKey(6));
        System.out.println(fructs3.containsValue("Red Apple"));

        try {
            int xx = 2;
            int xxx = 0;
            int x = xx / xxx;
        } catch (ArithmeticException e) {
            System.out.println("делить на ноль нельзя");
        } finally {
            System.out.println("этот блок выполняется всегда");
        }
        System.out.println(fructs2);

    }
}
