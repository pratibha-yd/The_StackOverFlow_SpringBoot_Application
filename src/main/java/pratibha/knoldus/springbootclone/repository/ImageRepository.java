package pratibha.knoldus.springbootclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pratibha.knoldus.springbootclone.domain.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
