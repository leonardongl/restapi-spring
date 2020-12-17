package restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.model.Contato;
import restapi.repository.ContatoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> listar() {
        return contatoRepository.findAll();
    }

    public Contato pesquisar(Long id) {
        Optional<Contato> optional = contatoRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
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
