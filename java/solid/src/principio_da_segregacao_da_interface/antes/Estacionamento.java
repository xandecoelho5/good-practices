package principio_da_segregacao_da_interface.antes;

public interface Estacionamento {

    void estacionarCarro();    // Diminuir contagem de vagas em 1

    void sairDaVagaComCarro(); // Aumentar contagem de vagas em 1

    void getCapacidade();    // Retornar capacidade de carros

    double calcularTaxa(Carro carro); // Retornar o preço com base no número de horas

    void pagar(Carro carro);
}

class Carro {
}
