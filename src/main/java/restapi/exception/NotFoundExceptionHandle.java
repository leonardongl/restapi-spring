package restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NotFoundExceptionHandle {
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<NotFoundException> handle(ObjectNotFoundException obj) {
        NotFoundException notFoundException = new NotFoundException(obj.getMessage(), HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notFoundException);
    }
}
