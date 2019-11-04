package br.com.softplan.sfppessoa.exception;

import org.springframework.http.HttpStatus;

public class BadRequest extends HttpException {
    public BadRequest() {
        super(HttpStatus.BAD_REQUEST);
    }

    public BadRequest(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }

    public BadRequest(String message, Throwable cause) {
        super(HttpStatus.BAD_REQUEST, message, cause);
    }

    public BadRequest(Throwable cause) {
        super(HttpStatus.BAD_REQUEST, cause);
    }

    protected BadRequest(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}