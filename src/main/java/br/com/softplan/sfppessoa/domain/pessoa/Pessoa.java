package br.com.softplan.sfppessoa.domain.pessoa;

import br.com.softplan.sfppessoa.domain.cidade.Cidade;
import br.com.softplan.sfppessoa.domain.pais.Pais;
import br.com.softplan.sfppessoa.domain.sexo.Sexo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @Enumerated(EnumType.ORDINAL)
    private Sexo sexo;
    @NotNull
    private LocalDate nascimento;

    private String email;
    @NotNull
    @Column(unique = true)
    private String cpf;
    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(name="pessoa_nascionalidade", joinColumns=
            {@JoinColumn(name="pessoa_id")}, inverseJoinColumns=
            {@JoinColumn(name="pais_id")})
    private List<Pais> nascionalidades;

    @ManyToOne
    private Cidade naturalidade;

    @NotNull
    private LocalDateTime dthCadastro;


}
