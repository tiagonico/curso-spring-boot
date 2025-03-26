package med.voli.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voli.api.endereco.DadosEndereco;

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