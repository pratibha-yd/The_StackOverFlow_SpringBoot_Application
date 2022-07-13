package pratibha.knoldus.springbootclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pratibha.knoldus.springbootclone.domain.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
