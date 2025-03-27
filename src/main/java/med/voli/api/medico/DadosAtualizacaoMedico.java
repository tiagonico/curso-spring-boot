package med.voli.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voli.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
    @NotNull
    Long id,
    String nome,
    String telefone,
    DadosEndereco endereco) {
}