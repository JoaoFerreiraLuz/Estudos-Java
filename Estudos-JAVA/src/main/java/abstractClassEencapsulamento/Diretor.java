package abstractClassEencapsulamento;

public class Diretor extends Funcionario{

    private Double percentualParticipacao;

    public Diretor(String nome, String identificacao, String nascimento, Double salario, Double percentualParticipacao){
        super(nome, identificacao, nascimento, salario);
        this.percentualParticipacao = percentualParticipacao;
    }

    public Double getPercentualParticipacao() {return percentualParticipacao;}
    public void setPercentualParticipacao(Double percentualParticipacao) {
        this.percentualParticipacao = percentualParticipacao;
    }

    @Override
    public String getBonificacao() {
        Double x = (this.getSalario() * this.getPercentualParticipacao()) / 100;
        return formataReal(x);
    }
}
