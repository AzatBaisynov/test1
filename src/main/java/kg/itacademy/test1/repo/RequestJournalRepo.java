package kg.itacademy.test1.repo;

import kg.itacademy.test1.entity.RequestJournal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestJournalRepo extends JpaRepository<RequestJournal, Long> {
}
