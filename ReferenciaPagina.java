import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class ReferenciaPagina {
    int numeroPagina;
    char tipoAcceso; // 'R' para lectura, 'W' para escritura

    public ReferenciaPagina(int numeroPagina, char tipoAcceso) {
        this.numeroPagina = numeroPagina;
        this.tipoAcceso = tipoAcceso;
    }
}
