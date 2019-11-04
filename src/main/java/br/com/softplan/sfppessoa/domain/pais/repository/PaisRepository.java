package br.com.softplan.sfppessoa.domain.pais.repository;

import br.com.softplan.sfppessoa.domain.pais.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais,Short> {
}
