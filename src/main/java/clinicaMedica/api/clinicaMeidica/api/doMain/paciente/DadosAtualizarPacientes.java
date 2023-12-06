package clinicaMedica.api.clinicaMeidica.api.doMain.paciente;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPacientes(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
