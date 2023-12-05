package clinicaMedica.api.clinicaMeidica.api.controller;


import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.DadosCadastroPaciente;
import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.Paciente;
import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.PacienteRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
