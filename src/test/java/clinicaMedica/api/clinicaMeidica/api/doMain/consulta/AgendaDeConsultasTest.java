package clinicaMedica.api.clinicaMeidica.api.doMain.consulta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.AutoConfigureDataJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@AutoConfigureDataJdbc
@WithMockUser
class AgendaDeConsultasTest {



    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações forem invalidas...")
    void agendar_cenario1() throws Exception {


    }
}