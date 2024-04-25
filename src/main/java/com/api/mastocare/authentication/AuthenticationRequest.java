package com.api.mastocare.authentication;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {

    @Email(message = "Email não está correto, use um email válido")
    @NotEmpty(message = "Email é obrigatório")
    @NotBlank(message = "Email é obrigatório")
    private String email;
    @NotEmpty(message = "Senha é obrigatório")
    @NotBlank(message = "Senha é obrigatório")
    @Size(min = 8, message = "A senha deve conter no mínimo 8 caracteres")
    private String password;

}
