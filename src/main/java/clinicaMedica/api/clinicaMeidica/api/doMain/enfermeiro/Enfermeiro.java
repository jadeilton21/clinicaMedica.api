package clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "enfermeiros")
@Entity(name = "enfermeiro")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Enfermeiro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String telefone;

    private Boolean ativo;
    private String coren;
    @Embedded
    private Endereco endereco;
    @Enumerated(EnumType.STRING)
    private EspecialidadeDoEnfermeiro especialidadeDoEnfermeiro;

    public Enfermeiro(DadosCadastrarEnfermeiro dados) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.ativo = ativo;
        this.coren = coren;
        this.endereco = endereco;
        this.especialidadeDoEnfermeiro = especialidadeDoEnfermeiro;
    }

    public void atualizarInformacoes(DadosAtualizarEnfermeiros dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }

    public void excluir() {

        this.ativo = false;
    }
}
