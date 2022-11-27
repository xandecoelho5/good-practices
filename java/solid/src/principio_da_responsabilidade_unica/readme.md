O princípio da responsabilidade única declara que uma classe deve fazer apenas uma coisa e, portanto, deve ter apenas uma razão para ser modificada.

De um modo mais técnico: somente uma alteração em potencial (lógica do banco de dados, lógica de registro e assim por diante) na especificação do software pode ser capaz de alterar a especificação da classe.

- O pacote 'antes' contém uma classe que não segue o princípio da responsabilidade única. 
- O pacote 'depois' contém a mesma classe, mas refatorada para seguir o princípio da responsabilidade única.

## Antes
A primeira violação está no método imprimirFatura, que tem a nossa lógica de impressão. De acordo com o princípio da responsabilidade única, nossa classe deve ter apenas uma única razão para ser alterada. Essa razão deve ser uma mudança no cálculo da fatura para nossa classes.

Nessa arquitetura, no entanto, se quiséssemos mudar o formato de impressão, precisaríamos mudar a classe. É por isso que não devemos misturar a lógica de impressão com a lógica de negócios na mesma classe.

Temos outro método que viola o princípio da responsabilidade única na nossa classe: o método salvarParaArquivo. É um erro muito comum misturar a lógica da persistência com a lógica dos negócios.

Não pense em termos de salvar um arquivo – poderíamos estar falando em salvar em um banco de dados, fazer uma chamada à API ou alguma outra coisa relacionada à persistência.

## Depois
Podemos criar novas classes para as lógicas de impressão e persistência, para não precisarmos mais modificar a classe Fatura para esses fins.

Agora, a nossa estrutura de classe obedece ao princípio de responsabilidade única e cada classe é responsável por um aspecto da nossa aplicação. Ótimo!
