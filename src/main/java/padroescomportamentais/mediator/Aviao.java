package padroescomportamentais.mediator;

public class Aviao {

    private String voo;

    public Aviao(String voo) {
        this.voo = voo;
    }

    public String solicitarPouso() {
        return TorreControle.getInstancia().receberPedidoPouso(voo);
    }

    public String solicitarDecolagem() {
        return TorreControle.getInstancia().receberPedidoDecolagem(voo);
    }
}
