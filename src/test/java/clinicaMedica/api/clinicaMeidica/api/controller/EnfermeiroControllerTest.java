package clinicaMedica.api.clinicaMeidica.api.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@WithMockUser
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class EnfermeiroControllerTest {

    @Test
    @DisplayName("Deve Devolver Código Htpp 404 quando informações forem invalidas")
    void cadastrarEnfermeiro() {
    }
}