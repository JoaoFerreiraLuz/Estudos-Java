package interfaces;

import java.util.Calendar;

public class Contrato implements Condominio,Aluguel{

    public Calendar inicioContrato;
    public Calendar fimContrato;
    public Double valorCondominio;
    public Double valorAluguel;
    public Inquilino inquilino;

    public Contrato(Inquilino inquilino, Calendar dataInicio, Calendar dataFim, Double valorCondominio, Double valorAluguel){
        this.inicioContrato = dataInicio;
        this.fimContrato = dataFim;
        this.inquilino = inquilino;
        this.valorCondominio = valorCondominio;
        this.valorAluguel = valorAluguel;
    }

    @Override
    public String getValorAluguel() {
        return formataReal(this.valorAluguel);
    }

    @Override
    public String getValorMultaAluguem(Integer meses) {
        Double x;
        Double aluguelAux = this.valorAluguel;
        for (int i = 0; i < meses; i++) {
            x = ((aluguelAux * 15) / 100) ;
            aluguelAux = aluguelAux + x;
        }
        return formataReal(aluguelAux);
    }

    @Override
    public String getValorCondominio() {
        return formataReal(this.valorCondominio);
    }


    @Override
    public String getValorMultaCondominio(Integer meses) {
        Double x;
        Double condominioAux = this.valorCondominio;
        for (int i = 0; i < meses; i++) {
            x = ((condominioAux * 10) / 100) ;
            condominioAux = condominioAux + x;
        }
        return formataReal(condominioAux);
    }

    public String formataReal(Double x){
        return String.format("R$%,.2f", x);
    }

}
