package br.com.softplan.sfppessoa.domain.pessoa.service;

import br.com.softplan.sfppessoa.domain.StandarService;
import br.com.softplan.sfppessoa.domain.pessoa.Pessoa;
import br.com.softplan.sfppessoa.domain.pessoa.repository.PessoaRepository;
import br.com.softplan.sfppessoa.exception.BadRequest;
import br.com.softplan.sfppessoa.exception.HttpException;
import br.com.softplan.sfppessoa.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService extends StandarService<Pessoa,Long, PessoaRepository> {
    private static final String PESSOA_NOT_FOUND="Pessoa não encontrada";
    private static final String PESSOA_EXISTS="CPF já cadastrado.";
    @Autowired
    public PessoaService(PessoaRepository repository) {
        super(repository);
    }

    @Override
    public void validateSave(Pessoa domain) throws HttpException {
        Pessoa pessoa = this.repository.findByCpf(domain.getCpf()).orElse(null);
        if(pessoa != null){
            throw new BadRequest(PESSOA_EXISTS);
        }
    }

    public Pessoa findByCpf(String cpf) throws NotFoundException {
        Optional<Pessoa> pessoa = this.repository.findByCpf(cpf);

        return pessoa.orElseThrow(()->  new NotFoundException(PESSOA_NOT_FOUND));
    }
}
