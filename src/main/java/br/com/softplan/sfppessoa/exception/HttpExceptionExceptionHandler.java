package br.com.softplan.sfppessoa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@ControllerAdvice
@RestController
public class HttpExceptionExceptionHandler {
    @ExceptionHandler({NotFoundException.class,BadRequest.class})
    public final ResponseEntity<ErroMessage> handleUserNotFoundException(HttpException ex, WebRequest request) {
        ErroMessage errorDetails = new ErroMessage(ex.getStatus(), ex.getMessage());
        return new ResponseEntity<>(errorDetails, ex.getStatus());
    }
    @ExceptionHandler({MethodArgumentNotValidException.class,})
    public final ResponseEntity<ErroMessage> handleUserNotFoundException(MethodArgumentNotValidException ex, WebRequest request) {
        BindingResult result = ex.getBindingResult();

        List<FieldError> fieldErrors = result.getFieldErrors();
        final StringBuilder message = new StringBuilder();
        fieldErrors.forEach(e->{
            if(message.length() != 0){
                message.append(",");
            }
            message.append(e.getDefaultMessage());

        });
        ErroMessage errorDetails = new ErroMessage(HttpStatus.BAD_REQUEST, message.toString());
        return new ResponseEntity<>(errorDetails, errorDetails.getStatus());
    }


}
