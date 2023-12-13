package clinicaMedica.api.clinicaMeidica.api.controller;

import clinicaMedica.api.clinicaMeidica.api.doMain.consulta.AgendaDeConsultas;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consultas")
@SecurityRequirement(name = "bearer-key")
public class ConsultaController {



    @Autowired
    private AgendaDeConsultas agendaDeConsultas;


}
