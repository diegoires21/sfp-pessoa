package br.com.softplan.sfppessoa.dto.uf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UFDto {

    private Short id;

    private String nome;

    private String sigla;

    private Short codPais;
}
