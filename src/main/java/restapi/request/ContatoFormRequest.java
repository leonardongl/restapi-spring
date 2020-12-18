package restapi.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ContatoFormRequest {
    @NotBlank(message = "Nome é um campo obrigatório.")
    private String nome;

    private String email;

    private String telefone;

    private char sexo;

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
