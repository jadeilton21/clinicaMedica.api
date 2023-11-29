package clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.DadosEndereco;
import clinicaMedica.api.clinicaMeidica.api.doMain.funcionario.EspecialidadeDoFuncionario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastrarEnfermeiro(

        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        String cpf,
        @NotBlank
        String coren,
        @NotNull
        EspecialidadeDoFuncionario especialidadeDoFuncionario,
        @Valid @NotNull DadosEndereco dadosEndereco
) {
}
