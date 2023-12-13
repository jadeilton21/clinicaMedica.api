package clinicaMedica.api.clinicaMeidica.api.doMain.consulta;

import clinicaMedica.api.clinicaMeidica.api.doMain.medico.Especialidade;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idEnfermeiro,
        Long idMedico,
        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data,
        Especialidade especialidade




) {
}
