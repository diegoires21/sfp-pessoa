package br.com.softplan.sfppessoa.domain.cidade.service;

import br.com.softplan.sfppessoa.domain.StandarService;
import br.com.softplan.sfppessoa.domain.cidade.Cidade;
import br.com.softplan.sfppessoa.domain.cidade.repository.CidadeRepository;
import br.com.softplan.sfppessoa.domain.uf.UF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService extends StandarService<Cidade,Integer, CidadeRepository> {
    @Autowired
    public CidadeService(CidadeRepository repository) {
        super(repository);
    }

    public List<Cidade> findByUfAndNome(UF uf,String nome){
        return  this.repository.findByUfAndNomeLike(uf,"%"+nome+"%");
    }
}
