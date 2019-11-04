package br.com.softplan.sfppessoa.dto.pais;

import br.com.softplan.sfppessoa.domain.pais.Pais;
import br.com.softplan.sfppessoa.dto.StandardParser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaisParser extends StandardParser<Pais,PaisDto> {

    @Override
    @Mapping(source = "id",target = "id")
    @Mapping(source = "nome",target = "nome")
    @Mapping(source = "nascionalidade",target = "nascionalidade")
    Pais parserToDomain(PaisDto dto);

    @Override
    @Mapping(source = "id",target = "id")
    @Mapping(source = "nome",target = "nome")
    @Mapping(source = "nascionalidade",target = "nascionalidade")
    PaisDto parserToDTO(Pais domain);
}
