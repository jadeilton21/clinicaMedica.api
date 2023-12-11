package clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro;

public record DadosListagemEnfermeiro(Long id, String nome, String cpf, String email, String telefone) {


    public DadosListagemEnfermeiro(Enfermeiro enfermeiro){

        this(enfermeiro.getId(),enfermeiro.getNome(),enfermeiro.getCpf(), enfermeiro.getCoren(), enfermeiro.getTelefone());
    }


}
