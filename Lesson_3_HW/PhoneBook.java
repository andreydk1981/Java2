package Lesson_3_HW;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, String> book = new HashMap<>();

    public void add(String firstName, String number) {
        if(this.book.containsKey(number)) System.out.println("number " + number +" is already taken by " + this.book.get(number));
        else this.book.put(number, firstName);
    }

    public void get(String firstName) {
        if (this.book.containsValue(firstName)) {
            System.out.print(firstName + ": ");
            for (Map.Entry line : this.book.entrySet()) {
                if (line.getValue().equals(firstName)) System.out.print(line.getKey() + " ");
            }
            System.out.println();
        } else System.out.println(firstName + " Not found in this phonebook");
    }

    public void list() {
        System.out.println("-----");
        System.out.println(this.book);
        System.out.println("-----");
    }
}
