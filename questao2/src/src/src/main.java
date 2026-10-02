package src;

public class main {
    public static void main(String[] args) {
        cliente Cliente = new cliente();

        brasilCheckout fabricaBR = (brasilCheckout) Cliente.solicitar("BRASIL");
        fabricaBR.NfsE = true;
        fabricaBR.PIX = true;
        fabricaBR.LGPD = true;
        System.out.println(fabricaBR.processarPedido());
        System.out.println();

        cliente Cliente2 = new cliente();

        mexicoCheckout fabricaMX = (mexicoCheckout) Cliente2.solicitar("MEXICO");
        fabricaMX.CFID = true;
        fabricaMX.SPEI = true;
        fabricaMX.LFPDPPP = true;
        System.out.println(fabricaMX.processarPedido());
        System.out.println();


    }
}
