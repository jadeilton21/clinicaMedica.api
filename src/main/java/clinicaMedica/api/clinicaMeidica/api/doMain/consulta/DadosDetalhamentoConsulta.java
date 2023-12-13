package clinicaMedica.api.clinicaMeidica.api.doMain.consulta;

import jakarta.validation.constraints.NotNull;

public record DadosDetalhamentoConsulta(
        @NotNull
        Long idConsulta,
        @NotNull
        MotivoDoCancelamento motivo
) {
}
