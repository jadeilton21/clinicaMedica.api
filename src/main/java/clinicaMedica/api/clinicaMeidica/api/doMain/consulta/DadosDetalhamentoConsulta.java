package clinicaMedica.api.clinicaMeidica.api.doMain.consulta;


import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(Long id, Long idMedico,Long idPaciente, Long idEnfermeiro, LocalDateTime data) {
    public DadosDetalhamentoConsulta(Consulta consulta) {
        this(consulta.getId(),consulta.getMedico().getId(),consulta.getEnfermeiro(),consulta.getPaciente().getId(),consulta.getData());
    }
}

