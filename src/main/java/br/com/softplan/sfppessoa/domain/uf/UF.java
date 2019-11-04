package br.com.softplan.sfppessoa.domain.uf;

import br.com.softplan.sfppessoa.domain.pais.Pais;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    private String nome;

    private String sigla;
    @ManyToOne
    private Pais pais;
}
