package clinicaMedica.api.clinicaMeidica.api.doMain.funcionario;

public record DadosListagemFuncionario(Long id, String nome, String cpf, String telefone, String email, EspecialidadeDoFuncionario especialidadeDoFuncionario) {



    public DadosListagemFuncionario(Funcionario funcionario){
        this(funcionario.getId(),funcionario.getNome(), funcionario.getCpf(), funcionario.getTelefone(),funcionario.getEmail(),funcionario.getEspecialidadeDoFuncionario());
    }
}
