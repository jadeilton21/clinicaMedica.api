package clinicaMedica.api.clinicaMeidica.api.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
@WithMockUser
class PacienteControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Deve Devolver Código 404 quando informações estiverem invalidas..")
    void cadastrarPaciente_cenario1() throws Exception{


        var response = mockMvc
                .perform(post("/pacientes"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());


    }


    @Test
    @DisplayName("Deve Devolver Código Htpp 404 quando informações estiveren invalidas..")
    void listarPaciente_cenario1() throws Exception{


        var response = mockMvc
                .perform(post("/pacientes"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());

    }

    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações estiverem invalidas..")
    void atualizarPacientes_cenario1() throws Exception {



        var response = mockMvc
                .perform(post("/pacientes"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }

    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações estiverem Invalidas.")
    void excluirPaciente_cenario1() throws Exception{

        var response = mockMvc
                .perform(post("/pacientes"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());


    }
}