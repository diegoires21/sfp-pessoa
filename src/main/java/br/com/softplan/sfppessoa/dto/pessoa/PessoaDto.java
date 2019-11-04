package br.com.softplan.sfppessoa.dto.pessoa;

import br.com.softplan.sfppessoa.domain.sexo.Sexo;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
public class PessoaDto {

    private Long id;
    @NotNull(message = "Campo nome inválido")
    private String nome;

    private String email;

    private Integer idNaturalidade;

    private Integer idEstadoNaturalidade;

    private Integer idPaisNaturalidade;

    private Sexo sexo;
    @NotNull(message = "Data nascimento")
    private LocalDate nascimento;

    @NotNull(message = "CPF inválido")
    private String cpf;

    private List<Short> nascionalidades;


}
