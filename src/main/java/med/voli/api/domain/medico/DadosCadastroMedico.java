package med.voli.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voli.api.domain.endereco.DadosEndereco;
import med.voli.api.enuns.Especialidade;

public record DadosCadastroMedico(
    @NotBlank
    String nome,
    @NotBlank
    @Email
    String email,

    @NotBlank
    String telefone,
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm,
    @NotNull
    Especialidade especialidade,

    @NotNull @Valid DadosEndereco endereco) {
}