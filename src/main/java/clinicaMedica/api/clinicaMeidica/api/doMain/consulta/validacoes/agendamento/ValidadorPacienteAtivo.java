package clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.agendamento;

import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.DadosAgendamentoConsulta;
import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteAtivo {

    @Autowired
    private PacienteRepository pacienteRepository;


    public void validar(DadosAgendamentoConsulta dados){

    }


}
