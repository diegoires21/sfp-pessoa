package br.com.softplan.sfppessoa.dto.cidade;

import br.com.softplan.sfppessoa.dto.uf.UFDto;
import lombok.Data;

@Data
public class CidadeDto {

    private Integer id;

    private String nome;

    private UFDto uf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UFDto getUf() {
        return uf;
    }

    public void setUf(UFDto uf) {
        this.uf = uf;
    }
}
