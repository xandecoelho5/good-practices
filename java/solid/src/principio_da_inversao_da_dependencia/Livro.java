package principio_da_inversao_da_dependencia;

class Livro {

    String nome;
    String nomeAutor;
    int ano;
    int preco;
    String isbn;

    public Livro(String nome, String nomeAutor, int ano, int preco, String isbn) {
        this.nome = nome;
        this.nomeAutor = nomeAutor;
        this.ano = ano;
        this.preco = preco;
        this.isbn = isbn;
    }
}
