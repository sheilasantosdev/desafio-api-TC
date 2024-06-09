package com.desafio.desafio_api.controller;

import com.desafio.desafio_api.model.Transacao;
import com.desafio.desafio_api.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TransacaoCcontroller {

    @Autowired
    private TransacaoService transacaoService;

    @PostMapping
    public ResponseEntity cadastrarTransacao(@RequestBody Transacao novaTransacao) {
       /* try {
            transacaoService.cadastrarTransacao(novaTransacao);
        } catch (RuntimeException exception) {
            return ResponseEntity.status(422).build();
        }*/
        transacaoService.cadastrarTransacao(novaTransacao);
        return ResponseEntity.status(201).build(); //(HttpStatus.CREATED).build
    }

}
