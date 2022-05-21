package abstractClassEencapsulamento;

public class AbstractClassEencapsulamentoStart {

    public static void main(String[] args) {

        System.out.println("Estes são exemplos encapsulamento e Abstract Class.");
        System.out.println("As classes Diretor e Gerente extendem Funcionario.");
        System.out.println("Os metodos para calculos tem diferença nos valores porem ao invés de fazer metodos diferentes fiz om @Override para tratar.");

        Diretor diretor = new Diretor("joao Luz", "Joao", "20-23-2000", 75000.0, 15.0);
        Gerente gerente = new Gerente("Pedro Luz", "pedro", "04-12-2004", 600000.0, "Tecnologia/inivacao", 15 );

        diretor.setNome("Joao Luz");
        gerente.setSubordinados(17);

        System.out.println("O Diretor tem o salario de " + diretor.getSalarioVisualizar() + " mais " + diretor.getBonificacao() + " em bonificação");
        System.out.println("O gerente tem o salario de " + gerente.getSalario().toString() + " mais " + gerente.getBonificacao() + " em bonificação");
    }

}
