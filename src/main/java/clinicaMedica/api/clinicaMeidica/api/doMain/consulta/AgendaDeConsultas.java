package clinicaMedica.api.clinicaMeidica.api.doMain.consulta;


import clinicaMedica.api.clinicaMeidica.api.doMain.ValidacaoException;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.agendamento.ValidadorAgendamentoDeConsultas;
import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.cancelamento.ValidadorCancelamentoDeConsultas;
import clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro.EnfermeiroRepository;
import clinicaMedica.api.clinicaMeidica.api.doMain.medico.Medico;
import clinicaMedica.api.clinicaMeidica.api.doMain.medico.MedicoRepository;
import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaDeConsultas {


    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private EnfermeiroRepository enfermeiroRepository;


    @Autowired
    private List<ValidadorAgendamentoDeConsultas> validadores;

    @Autowired
    private List<ValidadorCancelamentoDeConsultas> validadoresCancelamento;

    public DadosDetalhamentoConsulta agendar(DadosAgendamentoConsulta dados) {
        if ( dados.idPaciente() != null && !pacienteRepository.existsById(dados.idPaciente())) {
            throw new ValidacaoException("Id do Paciente Informando, Não Existe.");

        }

        if (dados.idMedico() != null && !medicoRepository.existsById(dados.idMedico())) {
            throw new ValidacaoException("Id do Médico Informado, Não Existe.");
        }

        validadores.forEach(v -> v.validar(dados));
        var enfermeiro = enfermeiroRepository.getReferenceById(dados.idEnfermeiro());
        var paciente = pacienteRepository.getReferenceById(dados.idPaciente());
        var medico = escolherMedico(dados);
        if (medico == null) {
            throw new ValidacaoException("Não existe médico disponível nessa data!");
        }
        var consulta = new Consulta(null,medico,paciente,enfermeiro, dados.data());
        consultaRepository.save(consulta);

        return new DadosDetalhamentoConsulta(consulta);

    }

    private Medico escolherMedico(DadosAgendamentoConsulta dados) {
        if (dados.idMedico() != null) {
            return medicoRepository.getReferenceById(dados.idMedico());
        }
        if(dados.especialidade() == null){
            throw new ValidacaoException("Especialidade é Obrigatorio se o Médico não for escolhido.");
        }
        return medicoRepository.escolherMedicoAleatorioLivreNaData(dados.especialidade(), dados.data());
    }

    public void cancelar(DadosCancelamentoConsulta dados) {
        if (!consultaRepository.existsById(dados.idConsulta())) {
            throw new ValidacaoException("Id da consulta informado não existe!");
        }

        validadoresCancelamento.forEach(vC -> vC.validar(dados));
        var consulta = consultaRepository.getReferenceById(dados.idConsulta());
        consulta.cancelar(dados.motivo());
    }


}
