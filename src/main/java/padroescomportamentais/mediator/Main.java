package padroescomportamentais.mediator;

public class Main {

    public static void main(String[] args) {
        Aviao aviao1 = new Aviao("AZ123");
        Aviao aviao2 = new Aviao("GL456");
        System.out.println(aviao1.solicitarPouso());
        System.out.println(aviao2.solicitarDecolagem());
    }
}
