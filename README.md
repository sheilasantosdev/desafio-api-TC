# Desafio Técnico - API REST para Transações e Estatísticas

## Introdução

Este desafio consiste em desenvolver uma API REST que recebe transações e retorna estatísticas sobre essas transações. O objetivo é avaliar suas habilidades de desenvolvimento e engenharia de software, incluindo a qualidade do código, facilidade de compreensão, organização do projeto, testes, segurança, entre outros fatores.

A API deve ser implementada utilizando Java com Spring Boot.

## Definição do Desafio

A seguir estão as instruções detalhadas e restrições que devem ser seguidas para a implementação da API.


### Endpoints da API

A API deve conter os seguintes endpoints e funcionalidades:

#### 1. Receber Transações: `POST /transacao`

Este endpoint recebe transações com valor e dataHora.

##### Exemplo de Requisição

```json
{
    "valor": 123.45,
    "dataHora": "2020-08-07T12:34:56.789-03:00"
}
```

##### Campos:

- `valor`: Valor decimal da transação (obrigatório, valor >= 0)
- `dataHora`: Data e hora da transação no formato ISO 8601 (obrigatório, no passado)

##### Respostas:

- `201 Created`: Transação aceita e registrada.
- `422 Unprocessable Entity`: Transação não aceita (critérios de aceitação não atendidos).
- `400 Bad Request`: Requisição inválida (por exemplo, JSON inválido).

#### 2. Limpar Transações: `DELETE /transacao`

Este endpoint apaga todas as transações armazenadas.

##### Resposta:

- `200 OK`: Todas as transações foram apagadas com sucesso.
