package Lesson_1;

import Lesson_1.imp.CachedPublicationService;
import Lesson_1.imp.DbPublicationService;

public class App {
    public static void main(String[] args) {
        PublicationService publicationService = new CachedPublicationService(new DbPublicationService().getHotPublication());
        for (int i = 0; i < 100; i++) {
            System.out.println(publicationService.getHotPublication());
        }
    }
}
