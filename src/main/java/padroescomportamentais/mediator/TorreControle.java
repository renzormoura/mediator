package padroescomportamentais.mediator;

public class TorreControle {

    private static TorreControle instancia = new TorreControle();

    private TorreControle() {}

    public static TorreControle getInstancia() {
        return instancia;
    }

    public String receberPedidoPouso(String voo) {
        return "Torre de Controle: pedido recebido.\n" +
                ">>" + Pista.getInstancia().autorizarPouso(voo);
    }

    public String receberPedidoDecolagem(String voo) {
        return "Torre de Controle: pedido recebido.\n" +
                ">>" + Pista.getInstancia().autorizarDecolagem(voo);
    }
}
