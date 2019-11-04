package br.com.softplan.sfppessoa.controller.uf;

import br.com.softplan.sfppessoa.domain.pais.Pais;
import br.com.softplan.sfppessoa.domain.uf.UF;
import br.com.softplan.sfppessoa.domain.uf.UFService;
import br.com.softplan.sfppessoa.dto.uf.UfParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paises/{idPais}/ufs")
public class UFPesquisaController {

    @Autowired
    private UFService service;

    private UfParser parser;

    @GetMapping
    public List<UF> findUfByPais(@PathVariable("idPais") Short idPais, @RequestParam(defaultValue = "") String nome){
        Pais pais =  new Pais();
        pais.setId(idPais);
        return service.findByPais(pais,nome);
    }
}
