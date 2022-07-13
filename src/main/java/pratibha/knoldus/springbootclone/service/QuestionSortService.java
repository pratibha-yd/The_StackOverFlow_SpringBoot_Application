package pratibha.knoldus.springbootclone.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pratibha.knoldus.springbootclone.service.impl.question.QuestionSortType;
import pratibha.knoldus.springbootclone.domain.Question;

public interface QuestionSortService {

    Page<Question> sort(Pageable pageable);

    boolean isSuitableFor(QuestionSortType sortType);

}
