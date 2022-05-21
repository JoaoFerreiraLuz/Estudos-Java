package herancaEpolimorfismo;

public class Bicicleta extends Veiculo{

    public String motor;

    public Bicicleta(String modelo, String tipo, Double valor, String motor) {
        super(modelo, tipo, valor);
        this.motor = motor;
    }

    @Override
    public Double precoVenda(Double valor){
        return valor - ((valor * 5) / 100);
    }

    @Override
    public Double precoFinanciamento (Double valor){
        return valor + ((valor * 10) / 100);
    }

    @Override
    public Double precoManutenca (Double valor){
        return (valor * 1) / 100;
    }
}
