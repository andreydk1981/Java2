package Lesson_3_HW;

public class App2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        System.out.println();
        phoneBook.add("Kozlov", "400-434");
        phoneBook.add("Dunaev", "400-330");
        phoneBook.add("Dunaev", "500-555");
        phoneBook.add("Petrov", "400-424");
        phoneBook.add("Yankin", "444-444");
        phoneBook.add("Sabarov", "400-454");
        phoneBook.add("Petrov", "400-456");
        phoneBook.add("Dunaev", "400-340");
        phoneBook.add("Pushkin", "400-340");

        phoneBook.list();
        phoneBook.get("Dunaev");
        phoneBook.get("Petrov");
        phoneBook.get("Antonov");
        phoneBook.get("Kozlov");
        phoneBook.get("Yankin");
    }

}
