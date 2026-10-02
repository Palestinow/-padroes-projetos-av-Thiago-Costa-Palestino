package src;

public class cliente {
    public static factoryCheckout solicitar(String pais){
        if (pais.equals("BRASIL")) {
            return new brasilCheckout();
        }
        if (pais.equals("MEXICO")) {
            return new mexicoCheckout();
        }
        return null;
    }
}
