package kg.itacademy.test1.Controller;

import kg.itacademy.examspr2.DTO.CinemaDTO;
import kg.itacademy.examspr2.DTO.RestorantDTO;
import kg.itacademy.examspr2.DTO.TicketDTO;
import kg.itacademy.test1.entity.RequestJournal;
import kg.itacademy.test1.service.RequestJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private RequestJournalService requestJournalService;

    @GetMapping("/book/{code}")
    public Object getObject(@PathVariable String code) {
        if (code.equals("R")) {
            requestJournalService.create(new RequestJournal("R"));
            return new RestorantDTO("Naimenovanie", "Adress", "Firm b", "site");
        } else if (code.equals("C")) {
            requestJournalService.create(new RequestJournal("C"));
            return new CinemaDTO("Naimen", "Vmest", "Add", "site");
        } else if (code.equals("T")) {
            requestJournalService.create(new RequestJournal("T"));
            return new TicketDTO("Naimen", "site", "spos");
        }
        return null;
    }
}
