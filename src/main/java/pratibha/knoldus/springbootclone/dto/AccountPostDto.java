package pratibha.knoldus.springbootclone.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * The type Account post dto.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountPostDto {

    @NotBlank(message = "Name can't be empty")
    @Size(message = "Name can't be more 15 characters", max = 15)
    private String name;

    @NotBlank(message = "Email can't be empty")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank(message = "Password can't be empty")
    @Size(message = "Password can't be less 6 characters", min = 6)
    private String password;

    @NotBlank(message = "Password confirm can't be empty")
    private String passwordConfirm;

}
