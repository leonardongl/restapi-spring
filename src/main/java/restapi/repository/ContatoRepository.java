package restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
