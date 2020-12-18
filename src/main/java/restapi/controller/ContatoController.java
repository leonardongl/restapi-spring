package restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.model.Contato;
import restapi.request.ContatoFormRequest;
import restapi.service.ContatoService;

import javax.validation.Valid;
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
    public Contato cadastrar(@Valid @RequestBody ContatoFormRequest contatoRequest) {
        Contato contato = new Contato(contatoRequest);
        return contatoService.cadastrar(contato);
    }

    @PutMapping("/{id}")
    public Contato editar(@Valid @RequestBody ContatoFormRequest contatoRequest, @PathVariable(value = "id") Long id) {
        Contato contato = new Contato(contatoRequest);
        return contatoService.editar(contato, id);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable(value = "id") Long id) {
        contatoService.excluir(id);
    }
}
