package NivelamentoJavaOIto.primeiraAula;

import java.util.*;
import java.util.function.Consumer;

public class primeiraAula_ {

    /* No Java 8 foram adicionados metodos default as interfaces.
    *  Com os metodos Defaul na interface não quebra nos lugares que ja utilizam a interface
    *  e permite que possamos utilizar
    *
    */
    public void main (String Args){
        List<String> palavras = new ArrayList<>();

        palavras.add("alura online");
        palavras.add("Editora casa do Codigo");
        palavras.add("Caelum");

        Collections.sort(palavras); // ordenando de A Z


        palavras.sort(Comparator.comparing(String::length)); // comparar pelo tamanho da palavra
        //no arrey de palavra é adicionado um sort e implementado um comparable, no comparable devemos adicionar o tipo
        //do objetoi a ser comparado e pelo que ele será comparado;


        //instanciando um consumer
        //desta forma ele ira realizar no foreach o consumer implementado no metodo;
        // se instanciado e definido dentro do metodo da forma que foi feito só ira funcionar aqui, se definirmos fora do
        //metodo poderemos utilizar em qualquer lugar
//         classe anonima
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

//        utilizando o consumer criado;
        palavras.forEach(consumer);

        // utilizando o forEach e implementando o consumer direto sem precisar instanciar
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        palavras.forEach( s -> System.out.println(s));

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));
    }

}
