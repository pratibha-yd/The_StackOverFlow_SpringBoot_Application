package pratibha.knoldus.springbootclone.dto.mapper;

import org.mapstruct.Mapper;
import pratibha.knoldus.springbootclone.dto.TagDto;
import pratibha.knoldus.springbootclone.domain.Tag;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface TagMapper {

    TagDto toTagDto(Tag tag);

    Tag toTag(TagDto tagDto);

    Set<TagDto> toTagsDto(Set<Tag> tags);

    Set<Tag> toTags(Set<TagDto> tagsDto);
}
