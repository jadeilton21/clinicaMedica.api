package clinicaMedica.api.clinicaMeidica.api.doMain.paciente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PacienteRepository extends JpaRepository<Paciente,Long> {
    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);

  boolean findAllById(Long id);
}
