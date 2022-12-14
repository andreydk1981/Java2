package Lesson_3_HW;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
 уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.*/

public class App1 {
    private static int count;
    public static void main(String[] args) {
        String[] ArrNames = new String[]{
                "Andrey",
                "Lena",
                "Arina",
                "Lesya",
                "John",
                "Andrey",
                "Lesya",
                "Arina",
                "Andrey",
                "Lesya",
                "Andrey",
                "Ded",
                "Ded",
                "Arina"
        };

        Map<String, Integer> map = new TreeMap<>();
        for (String arr : ArrNames) {
            count = 1;
            if(map.containsKey(arr)) {
                count = map.get(arr);
                map.put(arr, ++count);
            } else map.put(arr,count);
        }

        System.out.println(map);

    }
}

