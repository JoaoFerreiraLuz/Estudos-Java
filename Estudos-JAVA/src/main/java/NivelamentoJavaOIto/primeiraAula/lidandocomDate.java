package NivelamentoJavaOIto.primeiraAula;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class lidandocomDate {
    public void main(String args){

        LocalDate hoje = LocalDate.now()
;        LocalDate copaDoMundo = LocalDate.of(2099, Month.JANUARY, 25);
        int anos = copaDoMundo.getYear() - hoje.getYear();
        System.out.println(anos);
        Period periodo = Period.between(hoje, copaDoMundo);


    }
}
