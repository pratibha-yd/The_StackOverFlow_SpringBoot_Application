package pratibha.knoldus.springbootclone.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pratibha.knoldus.springbootclone.domain.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {

    List<Question> findAll();

    Page<Question> findAll(Pageable pageable);

    Optional<Question> findById(Long id);

    Question save(Question question);

    void deleteById(Long id);

}
