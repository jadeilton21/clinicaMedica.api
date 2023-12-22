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
class MedicoControllerTest {


    @Autowired
    private MockMvc mockMvc;
    @Test
    @WithMockUser
    @DisplayName("Deve Devolver Código HTTP 404 quando informações estiverem invalidas ")
    void cadastrarMedico_cenario1() throws Exception{

        var response = mockMvc
                .perform(post("/medicos"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());




    }

    @Test
    @WithMockUser
    @DisplayName("Deve Devolver Código HTTP 404 quando Informações forem Invalidas...")
    void listar_cenario1() throws Exception{


        var response = mockMvc
                .perform(post("/medicos"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }

    @Test
    @WithMockUser
    @DisplayName("Deve Devolver Código HTTP 404 quando informações forem invalidas..")
    void atualizar_cenario1() throws Exception{


        var response = mockMvc
                .perform(post("/medicos"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }

    @Test
    @WithMockUser
    @DisplayName("Deve Devolver Código HTTP 404 quando informações forem invalidas..")
    void exclui_cenario1() throws Exception {

        var response = mockMvc
                .perform(post("/medicos"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());


    }
}