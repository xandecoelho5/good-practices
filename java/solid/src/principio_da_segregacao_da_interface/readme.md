Segregação quer dizer manter as coisas separadas. O princípio da segregação da interface tem a ver com separar as interfaces.

O princípio declara que muitas interfaces específicas do cliente são melhores que uma interface de propósito geral. Os clientes não devem ser forçados a implementar uma função que não necessitam.

## Antes
Modelamos um estacionamento bem simplificado. É o tipo de estacionamento onde você paga um valor por hora. Imagine, agora, que queremos implementar um estacionamento gratuito.

Nossa interface de estacionamento era composta de 2 coisas: lógica relacionada ao estacionamento (estacionar, sair da vaga com o carro, obter a capacidade) e lógica relacionada ao pagamento.

O problema é ser muito específica. Por causa disso, nossa classe EstacionamentoGratuito foi forçada a implementar métodos relacionados ao pagamento que são irrelevantes. 

## Depois
Você, agora, separou os estacionamentos. Com esse novo modelo, podemos até ir mais longe e dividir EstacionamentoPago para dar suporte a tipos diferentes de pagamento.

Agora, nosso modelo é muito mais flexível, extensível e os clientes não precisam implementar lógica irrelevante, pois fornecemos somente funcionalidade relacionada ao estacionamento na interface de estacionamento.
