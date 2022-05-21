package abstractClassEencapsulamento;

public class Gerente extends Funcionario{

    private String setor;
    private Integer subordinados;

    public Gerente(String nome, String identificacao, String nascimento, Double salario, String setor, Integer subordinados){
        super(nome, identificacao, nascimento, salario);
        this.setor = setor;
        this.subordinados = subordinados;
    }

    public Integer getSubordinados() { return subordinados;}
    public void setSubordinados(Integer subordinados) {
        this.subordinados = subordinados;
    }
    public String getSetor() { return setor; }
    public void setSetor(String setor) {this.setor = setor;}

    @Override
    public String getBonificacao() {
        Double x = (this.getSalario() * (subordinados/10)) / 100;
        return formataReal(x);
    }
}
