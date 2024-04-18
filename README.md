# DIComponentOrder
DESAFIO Componentes e injeção de dependência

## Objetivo

Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem
de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor
básico do pedido, e adicionar o valor do frete. 

## Requisitos

A regra para cálculo do frete é a seguinte:

| Valor básico do pedido (sem desconto) | Frete    |
|---------------------------------------|----------|
| Abaixo de R$ 100.00                   | R$ 20.00 |
| De R$ 100.00 até R$ 200.00 exclusive  | R$ 12.00 |
| R$ 200.00 ou mais                     | Grátis   |

