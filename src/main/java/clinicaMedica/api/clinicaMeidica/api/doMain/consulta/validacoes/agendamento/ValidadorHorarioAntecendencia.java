package clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.agendamento;


import clinicaMedica.api.clinicaMeidica.api.doMain.ValidacaoException;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component("ValidadorHorarioAntecendenciaAgendamento")
public class ValidadorHorarioAntecendencia implements ValidadorAgendamentoDeConsultas{


    @Override
    public void validar(DadosAgendamentoConsulta dados) {


        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaEmMinutos = Duration.between(agora,dataConsulta).toMinutes();

        if(diferencaEmMinutos < 30){
            throw new ValidacaoException("Consulta deve ser agendada com antecedência mínima de 30 minuto");

        }

    }
}
