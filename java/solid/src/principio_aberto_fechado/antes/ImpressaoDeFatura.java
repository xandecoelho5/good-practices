package principio_aberto_fechado.antes;

public class ImpressaoDeFatura {
    private Fatura fatura;

    public ImpressaoDeFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public void imprimir() {
        System.out.println(fatura.quantidade + "x " + fatura.livro.nome + " " + fatura.livro.preco + "$");
        System.out.println("Porcentagem de desconto: " + fatura.porcDesconto);
        System.out.println("Procentagem de imposto: " + fatura.porcImposto);
        System.out.println("Total: " + fatura.total);
    }
}
