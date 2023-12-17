package clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.agendamento;

import clinicaMedica.api.clinicaMeidica.api.doMain.ValidacaoException;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsultas{
    @Override
    public void validar(DadosAgendamentoConsulta dados) {
        var dataCOnsulta = dados.data();
        var domingo = dataCOnsulta.getDayOfWeek().equals(DayOfWeek.FRIDAY);
        var antesDaAberturaDaClinica = dataCOnsulta.getHour() < 7;
        var depoisDoEncerramentoDaClinica = dataCOnsulta.getHour() > 18;

        if(domingo || antesDaAberturaDaClinica || depoisDoEncerramentoDaClinica){
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clínica.");


        }
    }
}
