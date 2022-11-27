package principio_da_substituicao_de_liskov;

class Quadrado extends Retangulo {

    public Quadrado() {}

    public Quadrado(int tamanho) {
        largura = altura = tamanho;
    }

    @Override
    public void setLargura(int largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }

    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }
}
