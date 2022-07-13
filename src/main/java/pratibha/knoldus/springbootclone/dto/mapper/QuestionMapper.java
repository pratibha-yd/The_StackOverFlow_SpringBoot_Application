package pratibha.knoldus.springbootclone.dto.mapper;

import org.mapstruct.*;
import pratibha.knoldus.springbootclone.dto.QuestionDto;
import pratibha.knoldus.springbootclone.domain.Question;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    Question toQuestion(QuestionDto questionDto);

    @Mappings({
        @Mapping(target = "author.questions", ignore = true),
        @Mapping(target = "author.answers", ignore = true),
    })
    QuestionDto toQuestionDto(Question question);

}
