package clinicaMedica.api.clinicaMeidica.api.controller;


import clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro.DadosCadastrarEnfermeiro;
import clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro.DadosListagemEnfermeiro;
import clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro.Enfermeiro;
import clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro.EnfermeiroRepository;
import clinicaMedica.api.clinicaMeidica.api.doMain.funcionario.Funcionario;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("enfermeiros")
@SecurityRequirement(name = "bearer-key")
public class EnfermeiroController {


    @Autowired
    private EnfermeiroRepository enfermeiroRepository;

    @PostMapping
    @Transactional
    public void cadastrarEnfermeiro(@RequestBody @Valid DadosCadastrarEnfermeiro dados){
        enfermeiroRepository.save(new Enfermeiro(dados));


    }

    @GetMapping
    public Page<DadosListagemEnfermeiro> listarEnfermeiro(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return enfermeiroRepository.findAllByAtivoTrue(paginacao).map(DadosListagemEnfermeiro::new);

    }
}
