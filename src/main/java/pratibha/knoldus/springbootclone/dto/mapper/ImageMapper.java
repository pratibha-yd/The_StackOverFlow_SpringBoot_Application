package pratibha.knoldus.springbootclone.dto.mapper;

import org.mapstruct.Mapper;
import pratibha.knoldus.springbootclone.domain.Image;
import pratibha.knoldus.springbootclone.dto.ImageDto;

@Mapper(componentModel = "spring")
public interface ImageMapper {

    Image toImage(ImageDto imageDto);

    ImageDto toImageDto(Image image);

}
