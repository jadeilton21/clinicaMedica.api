package clinicaMedica.api.clinicaMeidica.api.doMain.funcionario;

import clinicaMedica.api.clinicaMeidica.api.doMain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "funcionarios")
@Entity(name = "funcionario")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;

    private String telefone;

    private Boolean ativo;
    @Enumerated(EnumType.STRING)
    private EspecialidadeDoFuncionario especialidadeDoFuncionario;
    @Embedded
    private Endereco endereco;

    public Funcionario(DadosCadastrarFuncionario dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.ativo = true;
        this.especialidadeDoFuncionario = dados.especialidadeDoFuncionario();
        this.endereco = new Endereco(dados.dadosEndereco());
    }

    public void atualizarInformacoes(DadosAtualizarFuncionarios dados) {
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
