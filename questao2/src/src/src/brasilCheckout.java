package src;

public class brasilCheckout extends factoryCheckout{
    public boolean NfsE;
    public boolean PIX;
    public boolean LGPD;

    @Override 
    public comprovanteFiscal criarComprovanteFiscal(){
        notaFiscalBrasil doc = new notaFiscalBrasil();
        doc.NfsE = this.NfsE;
        return doc;
    }

    @Override
    public processadorDePagamento criarProcessadorDePagamento() {
        pagamentoBrasil pag = new pagamentoBrasil();
        pag.PIX = this.PIX;
        return pag;
    }

    @Override
    public termoDePrivacidade criarTermoDePrivacidade(){
        privacidadeBrasil termo = new privacidadeBrasil();
        termo.LGPD = this.LGPD;
        return termo;
    }
}
