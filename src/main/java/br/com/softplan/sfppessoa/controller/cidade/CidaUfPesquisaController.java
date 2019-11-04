package br.com.softplan.sfppessoa.controller.cidade;

import br.com.softplan.sfppessoa.domain.cidade.Cidade;
import br.com.softplan.sfppessoa.domain.cidade.service.CidadeService;
import br.com.softplan.sfppessoa.domain.uf.UF;
import br.com.softplan.sfppessoa.dto.cidade.CidadeDto;
import br.com.softplan.sfppessoa.dto.cidade.CidadeParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ufs/{idUf}/cidades")
public class CidaUfPesquisaController {
    @Autowired
    private CidadeService service;
    @Autowired
    private CidadeParser parser;
    @GetMapping
    public List<CidadeDto> findCidade(@PathVariable("idUf") Short idUf,@RequestParam(defaultValue = "") String nome){
        final UF uf = new UF();
        uf.setId(idUf);
        List<Cidade> cidades = service.findByUfAndNome(uf, nome);
        return parser.parserToDTO(cidades);
    }
}
