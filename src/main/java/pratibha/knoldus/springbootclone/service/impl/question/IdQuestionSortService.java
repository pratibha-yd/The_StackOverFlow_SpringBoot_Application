package pratibha.knoldus.springbootclone.service.impl.question;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pratibha.knoldus.springbootclone.repository.QuestionRepository;
import pratibha.knoldus.springbootclone.domain.Question;
import pratibha.knoldus.springbootclone.service.QuestionSortService;

@Service
@AllArgsConstructor
public class IdQuestionSortService implements QuestionSortService {

    private final QuestionRepository questionRepository;

    @Override
    public Page<Question> sort(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Override
    public boolean isSuitableFor(QuestionSortType sortType) {
        return QuestionSortType.ID.equals(sortType);
    }
}
