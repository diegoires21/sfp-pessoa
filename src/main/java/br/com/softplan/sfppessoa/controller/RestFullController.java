package br.com.softplan.sfppessoa.controller;


import br.com.softplan.sfppessoa.domain.StandarService;
import br.com.softplan.sfppessoa.dto.StandardParser;
import br.com.softplan.sfppessoa.exception.HttpException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

public class RestFullController<D,T,I extends Serializable,P extends StandardParser<D,T>,R extends JpaRepository<D, I>,S extends StandarService<D,I,R>> implements CrudController<T,I> {
    protected P parser;
    protected S service;

    public RestFullController(P parser,S service) {
        this.parser = parser;
        this.service = service;
    }

    @Override
    @PostMapping
    public T save(@RequestBody @Valid T dto) throws HttpException {
        D domain = this.parser.parserToDomain(dto);
        service.save(domain);
        return this.parser.parserToDTO(domain);
    }

    @Override
    @PutMapping("/{id}")
    public T update(@PathVariable("id") I id,@RequestBody @Valid T dto) throws HttpException {
        D domain = this.parser.parserToDomain(dto);
        service.update(domain);
        return this.parser.parserToDTO(domain);
    }

    @Override
    @GetMapping("/{id}")
    public T findById(@PathVariable("id") I id) {
        final D domain = service.findById(id);
        return parser.parserToDTO(domain);
    }

    @Override
    @GetMapping
    public List<T> findAll() {
        Iterable<D> domains = this.service.findAll();
        return parser.parserToDTO(domains);
    }
}
