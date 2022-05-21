package interfaces;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class interfacesStart {

    public static void main(String[] args){

        Inquilino inquilino = new Inquilino("Joao", 999999999 );
        Calendar dataInicio = new GregorianCalendar();
        Calendar dataFim = new GregorianCalendar();
        dataFim.add(Calendar.MONTH,12);

        //Inquilino inquilino, Calendar dataInicio, java.util.Calendar dataFim, Double valorCondominio, Double valorAluguel
        Contrato contrato = new Contrato(inquilino,dataInicio, dataFim, 400.0, 1000.0);

        System.out.println("Informo que o juros e composto" +
                "\nvalor do aluguel: " + contrato.getValorAluguel() + " valor do condominio " + contrato.getValorCondominio() +
                "\n valor do aluguel com atraso de um mes: " + contrato.getValorMultaAluguem(1) +
                "\n valor do condomino com atraso de um mes: "+ contrato.getValorMultaCondominio(1));

    }

}
