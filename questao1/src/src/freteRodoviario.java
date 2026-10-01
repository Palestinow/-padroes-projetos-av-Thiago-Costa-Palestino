package src;

public class freteRodoviario extends frete {
    public double valorCarga;
    
    @Override 
    public double calcularFrete(){
        double valorFrete = this.valorCarga * 0.02;
        return valorFrete;
    }

    @Override 
    public String listarDocumentos() {
        return "CT-e e MDF-e";
    }
}
