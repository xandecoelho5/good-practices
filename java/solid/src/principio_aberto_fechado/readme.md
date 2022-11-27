O princípio de aberto/fechado diz que as classes devem estar abertas para extensão, mas fechadas para modificação.

Modificação significa alterar o código de uma classe existente, enquanto extensão significa adicionar novas funcionalidades.

O que esse princípio representa, portanto é que: devemos poder adicionar novas funcionalidades sem tocar no código existente para a classe. Isso se dá porque, sempre que modificamos o código existente, estamos nos arriscando a criar bugs em potencial. Assim, devemos evitar de tocar em código em produção testado e confiável (em grande parte), se possível.

## Antes

Digamos que nosso chefe tenha nos dito que deseja que as faturas sejam salvas em um banco de dados onde possamos fazer pesquisas facilmente. Para nós, isso seria fácil, então pedimos pouco tempo!

Criamos o banco de dados, fazemos a conexão a ele e adicionamos um método de salvamento em nossa classe PersistenciaDaFatura.

Infelizmente para nós, os desenvolvedores preguiçosos da livraria, não criamos as classes de modo que pudessem ser extensíveis no futuro. Assim, para adicionar esse recurso, modificamos a classe PersistenciaDaFatura.

Se nossa criação das classes tivesse obedecido o princípio de aberto/fechado, não precisaríamos alterar essa classe.

## Depois
Mudamos o tipo de PersistenciaDaFatura para Interface e adicionamos um método de salvamento. Cada classe de persistência implementará esse método.

Agora, nossa lógica de persistência é facilmente extensível. Se nosso chefe nos pedir outro banco de dados e tiver dois tipos diferentes de BD, como o MySQL e o MongoDB, podemos fazer isso facilmente.

## Adendo
Digamos, porém, que tenhamos estendido nossa aplicação e que tenhamos diversas classes de persistência, como PersistenciaDaFatura, PersistenciaDeLivro e criamos uma classe GerenteDePersistencia que gere todas as classes de persistência:

```java
public class GerenteDePersistencia {
    PersistenciaDaFatura persistenciaDaFatura;
    PersistenciaDeLivro persistenciaDeLivro;
    
    public GerenteDePersistencia(PersistenciaDaFatura persistenciaDaFatura,
                                 PersistenciaDeLivro persistenciaDeLivro) {
        this.persistenciaDaFatura = persistenciaDaFatura;
        this.persistenciaDeLivro = persistenciaDeLivro;
    }
}
```
Agora, podemos passar qualquer classe que implemente a interface PersistenciaDaFatura para essa classe com o auxílio do polimorfismo. Essa é a flexibilidade fornecida pelas interfaces.
