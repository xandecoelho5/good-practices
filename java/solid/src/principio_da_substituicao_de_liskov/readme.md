O princípio da substituição de Liskov declara que as subclasses devem ser substituíveis por suas classes de base.

Isso quer dizer que, se a classe B for uma subclasse da classe A, devemos poder passar um objeto da classe B para qualquer método que espere um objeto da classe A e o método não deverá produzir resultados estranhos, nesse caso.

Esse é o comportamento esperado, pois, quando usamos a herança, levamos em conta que a classe filha herda tudo o que a superclasse tem. A classe filha estende o comportamento, mas nunca o reduz.

## Contexto
Temos uma classe Retangulo simples, e uma função getArea que retorna a área do retângulo.

Agora, decidimos criar outra classe para os quadrados. Como você deve saber, um quadrado é apenas um tipo de retângulo onde a largura é igual à altura.

Nossa classe Quadrado estende a classe Retangulo. Definimos que altura e largura têm o mesmo valor no construtor, mas não queremos que o usuário (aquele que usar nossa classe em seu código) altere altura e largura de maneira a poder violar a propriedade do quadrado.

Assim, sobrescrevemos os setters de ambas as propriedades sempre que uma delas é alterada. Ao fazer isso, no entanto, acabamos de violar o princípio da substituição de Liskov.

## Testando
O teste é feito através da classe Test.

O testador da equipe acaba de aparecer com a função de teste getAreaTeste e conta que a função getArea não passa no teste para objetos quadrados.

No primeiro teste, criamos um retângulo onde a largura é 2 e a altura é 3 e chamamos getAreaTeste. O resultado é 20, como esperávamos, mas algo dá errado ao passar o quadrado. Isso ocorre por que chamamos a função setAltura no teste e ela está definindo a largura também. Isso resulta em um retorno inesperado.
