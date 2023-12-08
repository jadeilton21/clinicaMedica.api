package clinicaMedica.api.clinicaMeidica.api.doMain.funcionario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRespository extends JpaRepository<Funcionario,Long> {
    Page<Funcionario> findAllByAtivoTrue(Pageable paginacao);
}
