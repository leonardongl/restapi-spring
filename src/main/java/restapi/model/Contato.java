package restapi.model;

import restapi.request.ContatoFormRequest;

import javax.persistence.*;

@Entity(name = "contatos")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = true, length = 50)
    private String email;

    @Column(nullable = true, length = 20)
    private String telefone;

    @Column(nullable = false)
    private char sexo;

    public Contato() { }

    public Contato(ContatoFormRequest contatoFormRequest) {
        this.nome = contatoFormRequest.getNome();
        this.email = contatoFormRequest.getEmail();
        this.telefone = contatoFormRequest.getTelefone();
        this.sexo = contatoFormRequest.getSexo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
