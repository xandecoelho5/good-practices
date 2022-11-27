package principio_da_responsabilidade_unica.depois;

public class PersistenciaDaFatura {
    private Fatura fatura;

    public PersistenciaDaFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public void salvarParaArquivo(String nomeArquivo) {
        // Cria um arquivo com o nome especificado e salva a fatura
    }
}
