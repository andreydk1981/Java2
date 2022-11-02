package Lesson_3_HW;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> book = new HashMap<>();

    public String add(String lastName, String number) {
        try {
            freeCellCheck(number);
            this.book.put(number, lastName);
            return String.format("Add %s %s successful", lastName, number);
        } catch (NumberAlredyTakenExeption exception){
            return exception.getMessage();
        }
            }
    private void freeCellCheck (String number){
        if (this.book.containsKey(number))
            throw new NumberAlredyTakenExeption (String.format("number %s is already taken by %s", number, this.book.get(number)));
    }

    public StringBuffer get(String lastName) {
        StringBuffer message = new StringBuffer(lastName + ": ");
        if (this.book.containsValue(lastName)) {

            for (Map.Entry line : this.book.entrySet()) {
                if (line.getValue().equals(lastName)) message.append((line.getKey() + " "));
            }
        } else {
            message.append("Not found in this phonebook");
            return message;
        }
        return message;
    }

    public void list() {
        System.out.println("-----");
        System.out.println(this.book);
        System.out.println("-----");
    }
}
