package principio_da_segregacao_da_interface.depois;

public interface Estacionamento {

    void estacionarCarro();    // Diminuir contagem de vagas em 1

    void sairDaVagaComCarro(); // Aumentar contagem de vagas em 1

    void getCapacidade();    // Retornar capacidade de carros
}
