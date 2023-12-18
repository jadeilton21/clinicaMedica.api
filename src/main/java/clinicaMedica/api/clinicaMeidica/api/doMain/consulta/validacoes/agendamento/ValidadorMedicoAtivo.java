package clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.agendamento;


import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.DadosAgendamentoConsulta;
import clinicaMedica.api.clinicaMeidica.api.doMain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo {


    @Autowired
    private MedicoRepository medicoRepository;


    public void validar(DadosAgendamentoConsulta dados){

    }
}
