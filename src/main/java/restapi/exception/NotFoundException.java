package restapi.exception;

public class NotFoundException {
    private String mensagem;
    private Integer status;

    public NotFoundException(String mensagem, Integer status) {
        this.mensagem = mensagem;
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Integer getStatus() {
        return status;
    }
}
