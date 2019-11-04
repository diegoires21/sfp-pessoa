package br.com.softplan.sfppessoa.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class HttpException  extends Exception{
    protected HttpStatus status;

    public HttpException(final HttpStatus status) {
        super();
        this.status = status;
    }

    public HttpException(final HttpStatus status,String message) {
        super(message);
        this.status = status;
    }

    public HttpException(final HttpStatus status,String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public HttpException(final HttpStatus status, Throwable cause) {
        super(cause);
        this.status = status;
    }

    protected HttpException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.status = status;
    }
}
