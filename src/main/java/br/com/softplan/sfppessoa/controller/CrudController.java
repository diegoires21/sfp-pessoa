package br.com.softplan.sfppessoa.controller;

import br.com.softplan.sfppessoa.exception.HttpException;

import java.io.Serializable;
import java.util.List;

public interface CrudController <D,I extends Serializable> {
    D save(D dto) throws HttpException;
    D update(I id,D dto ) throws HttpException;
    D findById(I id);
    List<D> findAll();
}
