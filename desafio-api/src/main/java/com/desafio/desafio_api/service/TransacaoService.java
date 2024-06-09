package com.desafio.desafio_api.service;

import com.desafio.desafio_api.model.Transacao;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {

    public List<Transacao> transacaoList = new ArrayList<>();

    public void cadastrarTransacao(Transacao transacao) {
      validarTransacao(transacao);
      transacaoList.add(transacao);
    }

    private void validarTransacao(Transacao transacao) {
        if (transacao.getValor() == null || transacao.getDataHora() == null) {
            throw new NullPointerException();
        }
        OffsetDateTime dataAtual = OffsetDateTime.now();

        if (transacao.getValor() < 0 || transacao.getDataHora().isAfter(dataAtual)) {
            throw new RuntimeException();
        }
    }
}
