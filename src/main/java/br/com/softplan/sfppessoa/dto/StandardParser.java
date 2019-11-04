package br.com.softplan.sfppessoa.dto;

import java.util.ArrayList;
import java.util.List;

public interface StandardParser <D,T> {


    D parserToDomain(T dto);

    T parserToDTO(D domain);

    default List<T> parserToDTO(Iterable<D> domain){
        List<T> list = new ArrayList<>();
        domain.forEach(e-> list.add(parserToDTO(e)));
        return list;
    }

    default List<T> parserToDTO(List<D> domain){
        List<T> list = new ArrayList<>();
        domain.forEach(e-> list.add(parserToDTO(e)));
        return list;
    }

}
