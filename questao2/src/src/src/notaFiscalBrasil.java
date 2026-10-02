package src;

public class notaFiscalBrasil extends comprovanteFiscal {
    public boolean NfsE;

    @Override
    public String gerar() {
        double valorIss = 5.0;
       
        
        return "Nota Fiscal Eletrônica com ISS de "+ valorIss +"%";
    }
}
