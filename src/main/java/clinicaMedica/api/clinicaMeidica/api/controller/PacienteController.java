package clinicaMedica.api.clinicaMeidica.api.controller;


import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.DadosCadastroPaciente;
import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.DadosListagemPaciente;
import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.Paciente;
import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.PacienteRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("pacientes")
@SecurityRequirement(name = "bearer-key")
public class PacienteController {


    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrarPaciente (@RequestBody @Valid DadosCadastroPaciente dados){
        pacienteRepository.save(new Paciente(dados));

    }

    @GetMapping
    public Page<DadosListagemPaciente> listarPaciente(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return pacienteRepository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
    }

    @PutMapping
    @Transactional
    public void atualizarPacientes(@RequestBody @Valid DadosAtualizarPacientes dados){



    }



}
