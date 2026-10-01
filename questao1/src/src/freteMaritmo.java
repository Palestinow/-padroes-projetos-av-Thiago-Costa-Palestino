package src;

public class freteMaritmo extends frete {
    public double valorCarga;
    
    @Override 
    public double calcularFrete(){
        double valorFrete = this.valorCarga * 0.01;
        return valorFrete;
    }

    @Override 
    public String listarDocumentos() {
        return "BL (bill of landing) e fatura comercial";
    }
}
