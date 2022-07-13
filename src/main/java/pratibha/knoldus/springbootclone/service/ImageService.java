package pratibha.knoldus.springbootclone.service;

import pratibha.knoldus.springbootclone.domain.Image;

import java.util.Optional;

public interface ImageService {

    Optional<Image> findById(Long id);

    Image save(Image image);

    void deleteById(Long id);

}
