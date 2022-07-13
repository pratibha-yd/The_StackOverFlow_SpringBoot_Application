package pratibha.knoldus.springbootclone.controller.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pratibha.knoldus.springbootclone.dto.AccountPostDto;

@Component
public class AccountPostDtoValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return AccountPostDto.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        AccountPostDto accountPostDto = (AccountPostDto) o;

        if (!accountPostDto.getPasswordConfirm().equals(accountPostDto.getPassword())) {
            errors.rejectValue("passwordConfirm", "error.validation.password.confirmation");
        }

    }
}
