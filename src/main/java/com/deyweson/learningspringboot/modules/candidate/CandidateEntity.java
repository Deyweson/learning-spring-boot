package com.deyweson.learningspringboot.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;


// Adiciona Get e Set para todos os atribuitos
@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
    private String username;

    @Email(message = "O campo [email] deve conter um e-mail válido")
    private String email;

    @Length(min = 10, max = 100)
    private String password;

    private String description;
    private String curriculum;

}
