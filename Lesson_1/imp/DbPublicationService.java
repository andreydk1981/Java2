package Lesson_1.imp;

import Lesson_1.Publication;
import Lesson_1.PublicationService;

public class DbPublicationService implements PublicationService {
    @Override
    public Publication getHotPublication() {
        return new Publication();
    }
}
