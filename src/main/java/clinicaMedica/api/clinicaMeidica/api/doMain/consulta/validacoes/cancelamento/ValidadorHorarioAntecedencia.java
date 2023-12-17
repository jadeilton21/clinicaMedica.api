package clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.cancelamento;


import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.ConsultaRepository;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.DadosCancelamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ValidadorHorarioAntecedenciaCancelamento")
public class ValidadorHorarioAntecedencia implements ValidadorCancelamentoDeConsultas{
    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public void validar(DadosCancelamentoConsulta dados) {

    }
}
