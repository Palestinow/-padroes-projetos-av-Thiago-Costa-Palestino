package src;

public class notaFiscalMexico extends comprovanteFiscal {
    public boolean CFID;

    @Override
    public String gerar() {
        double valorIVA = 16.0;
       
        
        return "Nota Fiscal Eletrônica com IVA de "+ valorIVA +"%";
    }
}
