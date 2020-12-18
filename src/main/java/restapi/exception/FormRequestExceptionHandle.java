package restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class FormRequestExceptionHandle {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<FormRequestException> handle(MethodArgumentNotValidException exception) {
        List<FormRequestException> erros = new ArrayList<>();
        exception.getBindingResult().getFieldErrors().forEach((e) -> {
            FormRequestException formRequestException =  new FormRequestException(e.getDefaultMessage(), e.getField());
            erros.add(formRequestException);
        });
        return erros;
    }
}