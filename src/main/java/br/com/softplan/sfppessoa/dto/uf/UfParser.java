package br.com.softplan.sfppessoa.dto.uf;

import br.com.softplan.sfppessoa.domain.uf.UF;
import br.com.softplan.sfppessoa.dto.StandardParser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UfParser extends StandardParser<UF,UFDto> {

    @Mapping(target = "pais.id",source = "codPais")
    UF parserToDomain(UFDto dto);

    @Override
    @Mapping(target = "codPais",source = "pais.id")
    UFDto parserToDTO(UF domain);
}
