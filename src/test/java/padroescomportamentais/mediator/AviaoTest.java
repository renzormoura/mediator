package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AviaoTest {

    @Test
    void deveSolicitarPouso() {
        Aviao aviao = new Aviao("AZ123");
        assertEquals("Torre de Controle: pedido recebido.\n" +
                ">>Pista livre para pouso do voo AZ123", aviao.solicitarPouso());
    }

    @Test
    void deveSolicitarDecolagem() {
        Aviao aviao = new Aviao("GL456");
        assertEquals("Torre de Controle: pedido recebido.\n" +
                ">>Pista livre para decolagem do voo GL456", aviao.solicitarDecolagem());
    }
}
