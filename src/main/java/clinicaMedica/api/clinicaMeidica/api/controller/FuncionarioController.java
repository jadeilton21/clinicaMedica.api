package clinicaMedica.api.clinicaMeidica.api.controller;

import clinicaMedica.api.clinicaMeidica.api.doMain.funcionario.DadosCadastrarFuncionario;
import clinicaMedica.api.clinicaMeidica.api.doMain.funcionario.DadosListagemFuncionario;
import clinicaMedica.api.clinicaMeidica.api.doMain.funcionario.Funcionario;
import clinicaMedica.api.clinicaMeidica.api.doMain.funcionario.FuncionarioRespository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



    public Page<DadosListagemFuncionario> listarFuncionario(@RequestBody@Valid DadosListagemFuncionario dados){

    }


}
