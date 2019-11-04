package br.com.softplan.sfppessoa.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends HttpException{
    public NotFoundException() {
        super(HttpStatus.NOT_FOUND);
    }

    public NotFoundException( String message) {
        super(HttpStatus.NOT_FOUND, message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(HttpStatus.NOT_FOUND, message, cause);
    }

    public NotFoundException( Throwable cause) {
        super(HttpStatus.NOT_FOUND, cause);
    }

    protected NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
