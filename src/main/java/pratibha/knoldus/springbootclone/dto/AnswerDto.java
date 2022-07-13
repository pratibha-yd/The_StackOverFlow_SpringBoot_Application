package pratibha.knoldus.springbootclone.dto;

import lombok.*;
import pratibha.knoldus.springbootclone.audit.Auditable;
import pratibha.knoldus.springbootclone.domain.Account;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDto extends Auditable<Account> {

    private Long id;

    private String content;

    private AccountDto author;

    private Boolean isAccepted;

    private Set<AccountDto> negativeVotes;

    private Set<AccountDto> positiveVotes;

    private QuestionDto question;

}
