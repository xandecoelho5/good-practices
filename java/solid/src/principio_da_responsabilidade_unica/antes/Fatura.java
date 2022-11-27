package principio_da_responsabilidade_unica.antes;

public class Fatura {

    private Livro livro;
    private int quantidade;
    private double porcDesconto;
    private double porcImposto;
    private double total;

    public Fatura(Livro livro, int quantidade, double porcDesconto, double porcImposto) {
        this.livro = livro;
        this.quantidade = quantidade;
        this.porcDesconto = porcDesconto;
        this.porcImposto = porcImposto;
        this.total = this.calcularTotal();
    }

    public double calcularTotal() {
        double preco = ((livro.preco - livro.preco * porcDesconto) * this.quantidade);

        double precoComImposto = preco * (1 + porcImposto);

        return precoComImposto;
    }

    public void imprimirFatura() {
        System.out.println(quantidade + "x " + livro.nome + " " +          livro.preco + "$");
        System.out.println("Porcentagem de desconto: " + porcDesconto);
        System.out.println("Procentagem de imposto: " + porcImposto);
        System.out.println("Total: " + total);
    }

    public void salvarParaArquivo(String nomeArquivo) {
        // Cria um arquivo com o nome especificado e salva a fatura
    }
}
