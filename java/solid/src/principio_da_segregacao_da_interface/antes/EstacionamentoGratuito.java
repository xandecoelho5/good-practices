package principio_da_segregacao_da_interface.antes;

public class EstacionamentoGratuito implements Estacionamento {

    @Override
    public void estacionarCarro() {

    }

    @Override
    public void sairDaVagaComCarro() {

    }

    @Override
    public void getCapacidade() {

    }

    @Override
    public double calcularTaxa(Carro carro) {
        return 0;
    }

    @Override
    public void pagar(Carro carro) {
        throw new RuntimeException("Estacionamento gratuito");
    }
}
