package src;
public class main {
    public static void main(String[] args) {
        
        freteAereo aereo = new freteAereo();
        aereo.solicitante = "thiago";
        aereo.tipoFrete = "aereo";
        aereo.valorCarga = 100000;
        aereo.valorFrete = aereo.calcularFrete();

            System.out.println(aereo.gerarResumo());

        freteMaritmo maritmo = new freteMaritmo();
        maritmo.solicitante = "costa";
        maritmo.tipoFrete = "maritmo";
        maritmo.valorCarga = 140000;
        maritmo.valorFrete = maritmo.calcularFrete();

            System.out.println(maritmo.gerarResumo());

        freteRodoviario rodoviario = new freteRodoviario();
        rodoviario.solicitante = "palestino";
        rodoviario.tipoFrete = "rodoviario";
        rodoviario.valorCarga = 90000;
        rodoviario.valorFrete = rodoviario.calcularFrete();
    
            System.out.println(rodoviario.gerarResumo());    
       
    }
}
