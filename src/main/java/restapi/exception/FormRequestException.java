package restapi.exception;

public class FormRequestException {
    private String mensagem;
    private String campo;

    public FormRequestException(String mensagem, String campo) {
        this.mensagem = mensagem;
        this.campo = campo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getCampo() {
        return campo;
    }
}
