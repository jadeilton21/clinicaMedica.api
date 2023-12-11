package clinicaMedica.api.clinicaMeidica.api.doMain.funcionario;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarFuncionarios(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
