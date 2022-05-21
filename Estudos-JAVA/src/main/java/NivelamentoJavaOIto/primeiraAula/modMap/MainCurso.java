package NivelamentoJavaOIto.primeiraAula.modMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MainCurso {
    public void main (String args){

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        // compara a quantidade de alunos dos cursos
        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

        // compara a quantidade de alunos do curso
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        //faz um stream de cursos com os cursos com mais de 100 alunos
        Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);

        // printa todos os cursoso com mais de 50 alunos
        cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));

        // printa todos os nomes de cursos
        cursos.forEach(c -> System.out.println(c.getNome()));

        // soma todos os alunos dos cursos que tem mais de 100 alunos
        int soma = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .mapToInt(Curso::getAlunos)
                .sum();

        // monta um stream de stringo com os nomes dos cursos
        Stream<String> streamString = cursos.stream().map(Curso::getNome);


        cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average();
    }

    public void LidandoOptional (){

        //O Optional<Class> define que o Objeto é opcional, pode ou não existir, desta forma podemos colocar o
        // 'optional.if' para validar e realizar algo dependendo do resultado;
        Optional<String> s = Optional.of(new String());

    }
}
