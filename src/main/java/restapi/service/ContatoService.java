package restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.model.Contato;
import restapi.repository.ContatoRepository;
import java.util.List;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> listar() {
        return contatoRepository.findAll();
    }

    public Contato pesquisar(Integer id) {
        return contatoRepository.findAllById(id);
    }

    public Contato cadastrar(Contato contato) {
        return contatoRepository.save(contato);
    }

    public Contato editar(Contato contato) {
        return contatoRepository.save(contato);
    }

    public void excluir(Contato contato) {
        contatoRepository.delete(contato);
    }
}
