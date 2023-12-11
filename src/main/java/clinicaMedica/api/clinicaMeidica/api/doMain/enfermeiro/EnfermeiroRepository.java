package clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermeiroRepository extends JpaRepository<Enfermeiro,Long> {
    Page<Enfermeiro> findAllByAtivoTrue(Pageable pageable);
}
