package clinicaMedica.api.clinicaMeidica.api.controller;

import lombok.val;
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
@WithMockUser
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class EnfermeiroControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    @DisplayName("Deve Devolver Código Htpp 404 quando informações forem invalidas")
    void cadastrarEnfermeiro_cenario1() throws Exception {


        var response = mockMvc.perform(post("/enfermeiros"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());



    }

    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações estiverem invalidas...")
    void atualizarEnfermeiro_cenario1() throws Exception {

        var response = mockMvc
                .perform(post("/enfermeiros"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());

    }

    @Test
    @DisplayName("Deve Devolver Código Http 404 quando Informações estiverem Invalidas...")
    void listarEnfermeiro_cenario1() throws Exception {

        var response = mockMvc
                .perform(post("/enfermeiros"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());

    }

    @Test
    @DisplayName("Deve Devolver Código http 404 quando informações forem invalidas..")
    void excluirEnfermeiros_cenario1() throws Exception {

        var response = mockMvc
                .perform(post("/enfermeiros"))
                .andReturn().getResponse();

        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());

    }
}