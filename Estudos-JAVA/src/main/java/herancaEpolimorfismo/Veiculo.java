package herancaEpolimorfismo;

//Classe principal
public class Veiculo {
    private String modelo;
    private String tipo;
    private Double valor;

    public Veiculo(String modelo, String tipo, Double valor ){
        this.modelo = modelo;
        this.tipo = tipo;
        this.valor = valor;
    };

    public Double precoVenda(Double valor){
        return valor - ((valor * 10) / 100);
    }

    public Double precoFinanciamento (Double valor){
        return valor + ((valor * 20) / 100);
    }

    public Double precoManutenca (Double valor){
        return (valor * 3) / 100;
    }

}
