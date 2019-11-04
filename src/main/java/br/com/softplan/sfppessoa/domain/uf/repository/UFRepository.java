package br.com.softplan.sfppessoa.domain.uf.repository;

import br.com.softplan.sfppessoa.domain.pais.Pais;
import br.com.softplan.sfppessoa.domain.uf.UF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UFRepository  extends JpaRepository<UF,Short> {

    List<UF> findByPaisAndNomeLike(Pais pais,String nome);

}
