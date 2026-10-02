package src;

public class pagamentoMexico extends processadorDePagamento{

    public boolean SPEI;

    @Override
    public String gerar() {
        return "Pagamento realizado via SPEI";
    }
    
}
