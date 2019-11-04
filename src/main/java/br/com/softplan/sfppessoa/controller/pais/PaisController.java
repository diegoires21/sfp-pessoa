package br.com.softplan.sfppessoa.controller.pais;


import br.com.softplan.sfppessoa.controller.RestFullController;
import br.com.softplan.sfppessoa.domain.StandarService;
import br.com.softplan.sfppessoa.domain.pais.Pais;
import br.com.softplan.sfppessoa.domain.pais.repository.PaisRepository;
import br.com.softplan.sfppessoa.domain.pais.service.PaisService;

import br.com.softplan.sfppessoa.dto.StandardParser;
import br.com.softplan.sfppessoa.dto.pais.PaisDto;
import br.com.softplan.sfppessoa.dto.pais.PaisParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends RestFullController<Pais, PaisDto,Short, StandardParser<Pais,PaisDto>, PaisRepository, PaisService> {

    @Autowired
    public PaisController(PaisParser paisParser, PaisService service) {
        super(paisParser, service);
    }
}
