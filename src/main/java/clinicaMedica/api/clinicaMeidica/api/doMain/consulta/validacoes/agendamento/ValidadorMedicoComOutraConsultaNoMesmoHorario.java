package clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.agendamento;


import clinicaMedica.api.clinicaMeidica.api.doMain.ValidacaoException;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.ConsultaRepository;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsultas {
    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public void validar(DadosAgendamentoConsulta dados) {

        var medicoPossuiUmaOutraConsultaNesseHorario = consultaRepository.existsByMedicoIdAndDataAndMotivoDoCancelamentoIsNull(dados.idMedico(), dados.data());
        if (!medicoPossuiUmaOutraConsultaNesseHorario) {
            throw new ValidacaoException("Médico já possui uma Consulta agendada nesse Momento.");
        }


    }
}