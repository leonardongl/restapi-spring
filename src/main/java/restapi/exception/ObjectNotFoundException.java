package restapi.exception;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String mensagem) {
        super(mensagem);
    }
}
