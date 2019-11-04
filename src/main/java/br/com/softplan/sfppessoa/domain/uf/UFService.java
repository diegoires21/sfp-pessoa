package br.com.softplan.sfppessoa.domain.uf;

import br.com.softplan.sfppessoa.domain.StandarService;
import br.com.softplan.sfppessoa.domain.pais.Pais;
import br.com.softplan.sfppessoa.domain.uf.repository.UFRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UFService extends StandarService<UF,Short, UFRepository> {
    @Autowired
    public UFService(UFRepository repository) {
        super(repository);
    }


    public List<UF> findByPais(Pais pais,String nome){
        return  this.repository.findByPaisAndNomeLike(pais,"%"+nome+"%");
    }


}
