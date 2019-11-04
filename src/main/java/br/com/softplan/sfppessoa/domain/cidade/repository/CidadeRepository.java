package br.com.softplan.sfppessoa.domain.cidade.repository;

import br.com.softplan.sfppessoa.domain.cidade.Cidade;
import br.com.softplan.sfppessoa.domain.pais.Pais;
import br.com.softplan.sfppessoa.domain.uf.UF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer> {

    List<Cidade> findByUfAndNomeLike(UF uf, String nome);

}
