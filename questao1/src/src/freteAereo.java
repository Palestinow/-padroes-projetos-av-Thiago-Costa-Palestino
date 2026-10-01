package src;

public class freteAereo extends frete {
    public double valorCarga;
    
    @Override 
    public double calcularFrete(){
        double valorFrete = this.valorCarga * 0.06;
        return valorFrete;
    }

    @Override 
    public String listarDocumentos() {
        return "AWB (Air Waybil)";
    }
}