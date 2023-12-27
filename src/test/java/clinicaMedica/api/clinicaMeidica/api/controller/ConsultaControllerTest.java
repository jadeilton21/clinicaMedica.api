package clinicaMedica.api.clinicaMeidica.api.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

class ConsultaControllerTest {

    @Autowired
    private MockMvc mocMvc;

    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações forem invalidas...")
    void agendar_cenario1() throws Exception {

        var response = mocMvc
                .perform(post("/consultas"))
                .andReturn().getResponse();

        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());


    }
}