package br.com.softplan.sfppessoa.dto.pais;

import lombok.*;
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class PaisDto {

    private Integer id;

    private String nome;

    private String nascionalidade;


}
