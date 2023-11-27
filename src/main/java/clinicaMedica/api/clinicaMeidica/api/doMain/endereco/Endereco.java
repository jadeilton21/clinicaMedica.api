package clinicaMedica.api.clinicaMeidica.api.doMain.endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {



    private String logradouro;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;
    private String numero;
    private String complemento;


    public Endereco(DadosEndereco dados) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
        this.numero = numero;
        this.complemento = complemento;
    }
}
