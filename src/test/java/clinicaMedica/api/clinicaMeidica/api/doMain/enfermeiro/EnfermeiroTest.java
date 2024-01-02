package clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser
class EnfermeiroTest {



    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações forem invalidas..")
    void atualizarInformacoes_cenario1() throws Exception{

        var response = mockMvc
                .perform(post("/enfermeiros"))
                .andReturn().getResponse();






    }
}