package clinicaMedica.api.clinicaMeidica.api.doMain.consulta.validacoes.agendamento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@WithMockUser
@AutoConfigureMockMvc
class ValidadorMedicoAtivoTest {
    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações estiverem invalidas...")
    void validar_cenario1() throws Exception {
    }
}