package src;

public class mexicoCheckout extends factoryCheckout{
    public boolean CFID;
    public boolean SPEI;
    public boolean LFPDPPP;

    @Override 
    public comprovanteFiscal criarComprovanteFiscal(){
        notaFiscalMexico doc = new notaFiscalMexico();
        doc.CFID = this.CFID;
        return doc;
    }

    @Override
    public processadorDePagamento criarProcessadorDePagamento() {
        pagamentoMexico pag = new pagamentoMexico();
        pag.SPEI = this.SPEI;
        return pag;
    }

    @Override
    public termoDePrivacidade criarTermoDePrivacidade(){
        privacidadeMexico termo = new privacidadeMexico();
        termo.LFPDPPP = this.LFPDPPP;
        return termo;
    }
}