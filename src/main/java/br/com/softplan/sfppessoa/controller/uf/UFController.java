package br.com.softplan.sfppessoa.controller.uf;

import br.com.softplan.sfppessoa.controller.RestFullController;
import br.com.softplan.sfppessoa.domain.uf.UF;
import br.com.softplan.sfppessoa.domain.uf.UFService;
import br.com.softplan.sfppessoa.domain.uf.repository.UFRepository;
import br.com.softplan.sfppessoa.dto.uf.UFDto;
import br.com.softplan.sfppessoa.dto.uf.UfParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ufs")
public class UFController extends RestFullController<UF, UFDto,Short, UfParser, UFRepository,UFService> {
    @Autowired
    public UFController(UfParser parser, UFService service) {
        super(parser, service);
    }

}
