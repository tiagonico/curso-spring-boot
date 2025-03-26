package med.voli.api.endereco;

import jakarta.validation.constraints.*;
import med.voli.api.endereco.DadosEndereco;

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