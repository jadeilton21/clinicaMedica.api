package clinicaMedica.api.clinicaMeidica.api.doMain.funcionario;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.DadosEndereco;
import clinicaMedica.api.clinicaMeidica.api.doMain.medico.Especialidade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastrarFuncionario(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        String cpf,
        @NotNull
        EspecialidadeDoFuncionario especialidadeDoFuncionario,
        @Valid @NotNull DadosEndereco dadosEndereco


) {
}
