package kg.itacademy.test1.service;

import kg.itacademy.test1.entity.RequestJournal;
import kg.itacademy.test1.repo.RequestJournalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestJournalServiceImpl implements RequestJournalService {
    @Autowired
    private RequestJournalRepo requestJournalRepo;
    @Override
    public RequestJournal create(RequestJournal requestJournal) {
        return requestJournalRepo.save(requestJournal);
    }
}
