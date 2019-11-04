package br.com.softplan.sfppessoa.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErroMessage {
    private HttpStatus status;

    private String mensagem;

    public ErroMessage(HttpStatus status, String mensagem) {
        this.status = status;
        this.mensagem = mensagem;
    }
}
