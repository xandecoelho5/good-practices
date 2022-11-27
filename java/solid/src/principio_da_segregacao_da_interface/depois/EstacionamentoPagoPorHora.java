package principio_da_segregacao_da_interface.depois;

public interface EstacionamentoPagoPorHora extends EstacionamentoPago {

    double calcularTaxa(Carro carro); // Retornar o preço com base no número de horas
}
