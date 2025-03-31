package med.voli.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voli.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
    @NotBlank
    String nome,
    @NotBlank
    @Email
    String email,

    @NotBlank
    String telefone,
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    String cpf,

    @NotNull @Valid DadosEndereco endereco
) {
}