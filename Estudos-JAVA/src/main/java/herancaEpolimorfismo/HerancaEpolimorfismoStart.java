package herancaEpolimorfismo;

public class HerancaEpolimorfismoStart {

    public static void main(String[] args) {

        System.out.println("Estes são exemplos de eranca e polimorfismo.");
        System.out.println("As classes Bicicleta e Automavel extendem Veiculo.");
        System.out.println("Os metodos para calculos tem diferença nos valores porem ao invés de fazer metodos diferentes fiz om @Override para tratar.");

        // instanciando os objetos
        Veiculo veiculo = new Veiculo("Kwid", "carro", 50.00);
        Bicicleta bicicleta = new Bicicleta("Speed", "stret", 20.00, "nao possui");

        System.out.println("veiculo:");
        Double precoVendaV = veiculo.precoVenda(90.00);
        Double precoFinancV = veiculo.precoFinanciamento(90.00);
        Double precoManutV = veiculo.precoManutenca(90.00);
        System.out.println("veiculo: "+ precoVendaV.toString() +" / "+ precoFinancV.toString() +" / "+ precoManutV.toString() );

        System.out.println("bicicleta:");
        Double precoVendaB = bicicleta.precoVenda(90.00);
        Double precoFinancB = bicicleta.precoFinanciamento(90.00);
        Double precoManutB = bicicleta.precoManutenca(90.00);
        System.out.println("veiculo: "+ precoVendaB.toString() +" / "+ precoFinancB.toString() +" / "+ precoManutB.toString() );

    }

}
