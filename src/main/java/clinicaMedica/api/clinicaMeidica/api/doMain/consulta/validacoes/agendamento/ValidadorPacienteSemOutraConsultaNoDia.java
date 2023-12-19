package clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.agendamento;


import clinicaMedica.api.clinicaMeidica.api.doMain.ValidacaoException;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.ConsultaRepository;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteSemOutraConsultaNoDia implements ValidadorAgendamentoDeConsultas{


    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public void validar(DadosAgendamentoConsulta dados) {
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHorario = dados.data().withHour(18);

        var pacientePossuiConsultaNoDia = consultaRepository.existsByPacienteIdAndDataBetween(dados.idPaciente(),primeiroHorario,ultimoHorario);

        if(!pacientePossuiConsultaNoDia){
            throw new ValidacaoException("Paciente já possui agendamento marcado para esse Hórario.");
        }

    }
}
