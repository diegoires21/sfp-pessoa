package br.com.softplan.sfppessoa.controller.cidade;

import br.com.softplan.sfppessoa.controller.RestFullController;
import br.com.softplan.sfppessoa.domain.cidade.Cidade;
import br.com.softplan.sfppessoa.domain.cidade.repository.CidadeRepository;
import br.com.softplan.sfppessoa.domain.cidade.service.CidadeService;
import br.com.softplan.sfppessoa.dto.cidade.CidadeDto;
import br.com.softplan.sfppessoa.dto.cidade.CidadeParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController extends RestFullController<Cidade, CidadeDto, Integer,CidadeParser, CidadeRepository,CidadeService> {
    @Autowired
    public CidadeController(CidadeParser parser, CidadeService service) {
        super(parser, service);
    }



}
