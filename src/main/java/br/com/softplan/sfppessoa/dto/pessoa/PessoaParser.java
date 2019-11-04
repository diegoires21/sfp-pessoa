package br.com.softplan.sfppessoa.dto.pessoa;

import br.com.softplan.sfppessoa.domain.pais.Pais;
import br.com.softplan.sfppessoa.domain.pessoa.Pessoa;
import br.com.softplan.sfppessoa.dto.StandardParser;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PessoaParser extends StandardParser<Pessoa,PessoaDto>{
    @Mapping(source = "idNaturalidade", target = "naturalidade.id")
    @Mapping(target = "dthCadastro", expression = "java(java.time.LocalDateTime.now())")
    Pessoa parserToDomain(PessoaDto dto);


    @Override
    @Mapping(source = "naturalidade.id", target = "idNaturalidade")
    @Mapping(source = "naturalidade.uf.id", target = "idEstadoNaturalidade")
    @Mapping(source = "naturalidade.uf.pais.id", target = "idPaisNaturalidade")
    PessoaDto parserToDTO(Pessoa domain);

    @IterableMapping(qualifiedByName = "parserPaisToDomain")
    List<Pais> parserPaisToDomain(List<Short> dates);

    @IterableMapping(qualifiedByName = "parserPaisToDto")
    List<Short> parserPaisToDto(List<Pais> dates);


    @Named("parserPaisToDomain")
    default Pais parserDtoToPais(Short paisId){
        Pais pais = new Pais();
        pais.setId(paisId);
        return pais;
    }

    @Named("parserPaisToDto")
    default Short parserDtoToPais(Pais pais){

        return pais.getId();
    }
}
