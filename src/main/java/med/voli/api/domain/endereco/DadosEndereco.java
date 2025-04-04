package med.voli.api.domain.endereco;

import jakarta.validation.constraints.*;
import med.voli.api.domain.endereco.DadosEndereco;

public record DadosEndereco(
    @NotBlank
    String logradouro,
    @NotBlank
    String bairro,
    @NotBlank
    @Pattern(regexp = "\\d{8}")
    String cep,
    @NotBlank
    String cidade,
    @NotBlank
    String uf,
    String complemento,
    String numero) {
}