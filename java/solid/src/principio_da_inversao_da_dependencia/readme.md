O princípio da inversão da dependência declara que nossas classes devem depender de interfaces ou de classes abstratas em vez de classes concretas e de funções.

Uncle Bob resume esse princípio da seguinte maneira:

"Se o princípio de aberto/fechado declara o objetivo da arquitetura orientada a objetos, o princípio de inversão da dependência declara seu mecanismo principal".
Esses dois princípios, de fato, estão relacionados. Aplicamos esse padrão anteriormente enquanto discutíamos o princípio de aberto/fechado.

Queremos que as nossas classes estejam abertas para extensão, por isso reorganizamos as nossas dependências para que dependam de interfaces em vez de classes concretas. Nossa classe GerenteDePersistencia depende de PersistenciaDaFatura em vez de classes que implementam aquela interface.
