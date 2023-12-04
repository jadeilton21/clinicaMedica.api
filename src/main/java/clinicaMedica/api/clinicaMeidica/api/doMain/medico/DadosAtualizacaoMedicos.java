package clinicaMedica.api.clinicaMeidica.api.doMain.medico;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedicos(@NotNull
                                        Long id,
                                      String nome,
                                      String telefone,
                                      DadosEndereco endereco) {
}
