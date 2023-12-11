package clinicaMedica.api.clinicaMeidica.api.controller;

import clinicaMedica.api.clinicaMeidica.api.doMain.funcionario.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("funcionarios")
@SecurityRequirement(name = "bearer-key")
public class FuncionarioController {




    @Autowired
    private FuncionarioRespository funcionarioRespository;
    @PostMapping
    @Transactional
    public void cadastrarFuncionario(@RequestBody @Valid DadosCadastrarFuncionario dados){

        funcionarioRespository.save(new Funcionario(dados));

    }


    @GetMapping
    public Page<DadosListagemFuncionario> listarFuncionario(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return funcionarioRespository.findAllByAtivoTrue(paginacao).map(DadosListagemFuncionario::new);
    }


    @PutMapping
    @Transactional
    public ResponseEntity<DadosListagemFuncionario> atualizarFuncionario(@RequestBody @Valid DadosAtualizarFuncionarios dados){

        var funcionario = funcionarioRespository.getReferenceById(dados.id());
        funcionario.atualizarInformacoes(dados);
        return ResponseEntity.ok(new DadosListagemFuncionario(funcionario));

    }


}
