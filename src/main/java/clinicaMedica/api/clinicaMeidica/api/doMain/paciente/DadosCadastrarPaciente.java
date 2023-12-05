package clinicaMedica.api.clinicaMeidica.api.doMain.paciente;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastrarPaciente(@NotBlank
                                     String nome,
                                     @NotBlank
                                     @Email
                                     String email,

                                     @NotBlank
                                     String telefone,
                                     @NotBlank
                                     @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")
                                     String cpf,

                                     @NotNull @Valid DadosEndereco endereco) {
}
