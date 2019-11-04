package br.com.softplan.sfppessoa.domain;

import br.com.softplan.sfppessoa.exception.HttpException;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class StandarService<D, I,R extends JpaRepository<D, I>> {

    protected R repository;

    public StandarService(R repository) {
        this.repository = repository;
    }

    public Iterable<D> findAll(){
        return this.repository.findAll();
    }

    public D findById(I id){
        return this.repository.findById(id).get();
    }

    public void save(D domain) throws HttpException {
        validateSave(domain);
        this.repository.save(domain);
    }
    public void update(D domain) throws HttpException {
        validateUpdate(domain);
        this.repository.save(domain);
    }

    public void validateSave(D domain) throws HttpException{

    }
    public void validateUpdate(D domain) throws HttpException{

    }
}
