package pratibha.knoldus.springbootclone.dto;

import lombok.*;
import pratibha.knoldus.springbootclone.audit.Auditable;
import pratibha.knoldus.springbootclone.domain.Account;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto extends Auditable<Account> {

    private Long id;

    private String title;

    private String body;

    private Set<TagDto> tags;

    private Set<AccountDto> positiveVotes;

    private Set<AccountDto> negativeVotes;

    @NotNull(message = "Account NOT NULL")
    private AccountDto author;

    private List<AnswerDto> answers;

}
