package br.com.softplan.sfppessoa.domain.pais;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    private String nome;

    private String nascionalidade;

}
