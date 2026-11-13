package padroescomportamentais.mediator;

public class Pista implements Setor {

    private static Pista instancia = new Pista();

    private Pista() {}

    public static Pista getInstancia() {
        return instancia;
    }

    public String autorizarPouso(String voo) {
        return "Pista livre para pouso do voo " + voo;
    }

    public String autorizarDecolagem(String voo) {
        return "Pista livre para decolagem do voo " + voo;
    }
}
