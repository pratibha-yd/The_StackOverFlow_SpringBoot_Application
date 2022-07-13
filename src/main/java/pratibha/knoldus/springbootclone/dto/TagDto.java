package pratibha.knoldus.springbootclone.dto;

import lombok.*;

import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TagDto {

    private Long id;

    private String name;

    private String description;

    private Set<QuestionDto> questions;

}
