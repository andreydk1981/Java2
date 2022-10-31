package Lesson_3_HW;

public class App2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.list();
        System.out.println(phoneBook.add("Kozlov", "400-434"));
        System.out.println(phoneBook.add("Dunaev", "400-330"));
        System.out.println(phoneBook.add("Dunaev", "500-555"));
        System.out.println(phoneBook.add("Petrov", "400-424"));
        System.out.println(phoneBook.add("Yankin", "444-444"));
        System.out.println(phoneBook.add("Sabarov", "400-454"));
        System.out.println(phoneBook.add("Petrov", "400-456"));
        System.out.println(phoneBook.add("Dunaev", "400-340"));
        System.out.println(phoneBook.add("Pushkin", "400-340"));

        phoneBook.list();
        System.out.println(phoneBook.get("Dunaev"));
        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Antonov"));
        System.out.println(phoneBook.get("Kozlov"));
        System.out.println(phoneBook.get("Yankin"));
    }

}
