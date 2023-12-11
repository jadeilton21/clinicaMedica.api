package clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarEnfermeiros(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
