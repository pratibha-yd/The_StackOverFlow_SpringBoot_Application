package pratibha.knoldus.springbootclone.dto.mapper;

import org.mapstruct.*;
import pratibha.knoldus.springbootclone.dto.AccountDto;
import pratibha.knoldus.springbootclone.domain.Account;
import pratibha.knoldus.springbootclone.domain.Question;
import pratibha.knoldus.springbootclone.dto.AccountPostDto;
import pratibha.knoldus.springbootclone.dto.QuestionDto;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(target = "questions", qualifiedByName = "questionsToQuestionDto")
    AccountDto toAccountDto(Account account);

    @Named("questionsToQuestionsDto")
    @Mapping(target = "author", expression = "java(null)")
    QuestionDto toQuestionDto(Question question);

    @Mappings({
            @Mapping(target = "questions", ignore = true),
            @Mapping(target = "password", ignore = true)
    })
    Account toAccount(AccountDto accountDto);

    @Mapping(target = "id", ignore = true)
    Account postDtoToAccount(AccountPostDto accountPostDto);

}
