package src;

public class pagamentoBrasil extends processadorDePagamento{

    public boolean PIX;

    @Override
    public String gerar() {
        return "Pagamento realizado via PIX";
    }
    
}
