package br.com.softplan.sfppessoa.domain.pessoa.repository;

import br.com.softplan.sfppessoa.domain.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
    Optional<Pessoa> findByCpf(String cpf);
}
