package src;

public abstract class factoryCheckout {
 
    public abstract comprovanteFiscal criarComprovanteFiscal();
    public abstract processadorDePagamento criarProcessadorDePagamento();
    public abstract termoDePrivacidade criarTermoDePrivacidade();

    public String processarPedido() {
        comprovanteFiscal comprovante = criarComprovanteFiscal();
        processadorDePagamento pagamento = criarProcessadorDePagamento();
        termoDePrivacidade termo = criarTermoDePrivacidade();

        return "=== RELATÓRIO DO PEDIDO ===\n"
             + "Comprovante Fiscal : " + comprovante.gerar() + "\n"
             + "Pagamento        : " + pagamento.gerar() + "\n"
             + "Termo de privacidade: " + termo.gerar();
    }
 
 
}
