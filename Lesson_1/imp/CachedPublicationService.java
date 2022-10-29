package Lesson_1.imp;

import Lesson_1.Publication;
import Lesson_1.PublicationService;

public class CachedPublicationService implements PublicationService {
    private final Publication publication;

    public CachedPublicationService(Publication publication) {
        this.publication = publication;
    }

    @Override
    public Publication getHotPublication() {
        return publication;
    }
}
