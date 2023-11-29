package clinicaMedica.api.clinicaMeidica.api.doMain.medico;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {
}
