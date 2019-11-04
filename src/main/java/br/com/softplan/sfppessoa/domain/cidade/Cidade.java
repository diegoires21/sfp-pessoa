package br.com.softplan.sfppessoa.domain.cidade;

import br.com.softplan.sfppessoa.domain.uf.UF;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    @ManyToOne
    private UF uf;
}
