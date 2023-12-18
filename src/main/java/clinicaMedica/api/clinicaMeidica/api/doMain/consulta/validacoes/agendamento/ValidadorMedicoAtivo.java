package clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.agendamento;


import clinicaMedica.api.clinicaMeidica.api.doMain.ValidacaoException;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.DadosAgendamentoConsulta;
import clinicaMedica.api.clinicaMeidica.api.doMain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo {


    @Autowired
    private MedicoRepository medicoRepository;


    public void validar(DadosAgendamentoConsulta dados){

        if(dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = medicoRepository.findAllById(dados.idMedico());
        if(!medicoEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendada com o Médico.");
        }



    }
}
