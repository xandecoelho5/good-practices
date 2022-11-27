package principio_da_inversao_da_dependencia;

public class GerenteDePersistencia {

    PersistenciaDaFatura persistenciaDaFatura;
    PersistenciaDeLivro persistenciaDeLivro;

    public GerenteDePersistencia(PersistenciaDaFatura persistenciaDaFatura, PersistenciaDeLivro persistenciaDeLivro) {
        this.persistenciaDaFatura = persistenciaDaFatura;
        this.persistenciaDeLivro = persistenciaDeLivro;
    }
}
