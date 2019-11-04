package br.com.softplan.sfppessoa.domain.pais.service;

import br.com.softplan.sfppessoa.domain.StandarService;
import br.com.softplan.sfppessoa.domain.pais.Pais;
import br.com.softplan.sfppessoa.domain.pais.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService extends StandarService<Pais,Short,PaisRepository> {
    @Autowired
    public PaisService(PaisRepository repository) {
        super(repository);
    }
}
