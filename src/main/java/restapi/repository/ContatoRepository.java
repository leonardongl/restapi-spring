package restapi.repository;

import org.springframework.data.repository.CrudRepository;
import restapi.model.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Long> {

}
