package restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import restapi.model.Contato;
import restapi.service.ContatoService;

@RestController
public class ContatoController {
    @Autowired
    ContatoService contatoService;

    @GetMapping
    public List<Contato> listar() {
        return contatoService.listar();
    }

    @GetMapping("/{id}")
    public Contato pesquisar(@PathVariable(value = "id") Integer id) {
        return contatoService.pesquisar(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contato cadastrar(@RequestBody Contato contato) {
        return contatoService.cadastrar(contato);
    }

    @PutMapping
    public Contato editar(@RequestBody Contato contato) {
        return contatoService.editar(contato);
    }

    @DeleteMapping
    public void excluir(@RequestBody Contato contato) {
        contatoService.excluir(contato);
    }
}
