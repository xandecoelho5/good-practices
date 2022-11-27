package principio_da_substituicao_de_liskov;

class Test {

    static void getAreaTeste(Retangulo r) {
        int largura = r.getLargura();
        r.setAltura(10);
        System.out.println("Área esperada de " + (largura * 10) + ", obteve " + r.getArea());
    }

    public static void main(String[] args) {
        Retangulo rc = new Retangulo(2, 3);
        getAreaTeste(rc);

        Retangulo sq = new Quadrado();
        sq.setLargura(5);
        getAreaTeste(sq);
    }
}
