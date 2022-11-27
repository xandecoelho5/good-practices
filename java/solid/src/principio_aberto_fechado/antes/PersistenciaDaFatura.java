package principio_aberto_fechado.antes;

public class PersistenciaDaFatura {
    Fatura fatura;

    public PersistenciaDaFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public void salvarParaArquivo(String nomeArquivo) {
        // Cria um arquivo com o nome especificado e salva a fatura
    }

    public void salvarParaBancoDeDados() {
        // Salva a fatura num banco de dados
    }
}
