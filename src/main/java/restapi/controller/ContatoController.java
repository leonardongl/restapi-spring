package restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.model.Contato;
import restapi.service.ContatoService;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/contatos")
public class ContatoController {
    @Autowired
    ContatoService contatoService;

    @GetMapping
    public List<Contato> listar() {
        return contatoService.listar();
    }

    @GetMapping("/{id}")
    public Contato pesquisar(@PathVariable(value = "id") Long id) {
        return contatoService.pesquisar(id);
    }

    @PostMapping
    public Contato cadastrar(@RequestBody Contato contato) {
        return contatoService.cadastrar(contato);
    }

    @PutMapping
    public Contato editar(@RequestBody Contato contato) {
        return contatoService.editar(contato);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable(value = "id") Long id) {
        contatoService.excluir(id);
    }
}
