package br.com.softplan.sfppessoa.dto.cidade;

import br.com.softplan.sfppessoa.domain.cidade.Cidade;
import br.com.softplan.sfppessoa.dto.StandardParser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CidadeParser extends StandardParser<Cidade,CidadeDto> {
}
