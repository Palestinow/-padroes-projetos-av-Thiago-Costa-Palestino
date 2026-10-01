package src;

public abstract class frete {

    public String solicitante;
    public String tipoFrete;
    public double valorFrete;
    public String documentos;

    public abstract double calcularFrete();
    public abstract String listarDocumentos();

    public String gerarResumo() {
        return "tipo de frete: " + this.tipoFrete + "\n"
             + "nome do cliente: " + this.solicitante + "\n"
             + "valor do frete: R$ " + String.format("%.2f", this.valorFrete) + "\n"
             + "Documentos exigidos: " + this.listarDocumentos();
    }
    
}
