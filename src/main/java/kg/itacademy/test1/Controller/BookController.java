package kg.itacademy.test1.Controller;

import kg.itacademy.examspr2.DTO.CinemaDTO;
import kg.itacademy.examspr2.DTO.RestorantDTO;
import kg.itacademy.examspr2.DTO.TicketDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/book/{code}")
    public Object getObject(@PathVariable String code){
        if (code.equals("R")) return new RestorantDTO("Naimenovanie", "Adress", "Firm b", "site");
        else if (code.equals("C")) return new CinemaDTO("Naimen", "Vmest", "Add", "site");
        else if (code.equals("T")) return new TicketDTO("Naimen", "site", "spos");
            return null;
    }
}
