package br.com.softplan.sfppessoa.controller.pessoa;

import br.com.softplan.sfppessoa.controller.RestFullController;
import br.com.softplan.sfppessoa.domain.pessoa.Pessoa;
import br.com.softplan.sfppessoa.domain.pessoa.repository.PessoaRepository;
import br.com.softplan.sfppessoa.domain.pessoa.service.PessoaService;
import br.com.softplan.sfppessoa.dto.pessoa.PessoaDto;
import br.com.softplan.sfppessoa.dto.pessoa.PessoaParser;
import br.com.softplan.sfppessoa.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController extends RestFullController<Pessoa, PessoaDto,Long, PessoaParser, PessoaRepository, PessoaService> {

    @Autowired
    public PessoaController(PessoaParser parser, PessoaService service) {
        super(parser, service);
    }

    @RequestMapping(path = "/{cpf}/cpf",method = RequestMethod.GET)
    public PessoaDto findByCpf(@PathVariable("cpf") String cpf) throws NotFoundException {
        Pessoa pessoa = this.service.findByCpf(cpf);
        return this.parser.parserToDTO(pessoa);
    }

}
