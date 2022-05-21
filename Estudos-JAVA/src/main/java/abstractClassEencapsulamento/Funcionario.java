package abstractClassEencapsulamento;

import java.util.PrimitiveIterator;

public abstract class Funcionario {

    private String nome;
    private String identificacao;
    private String nascimento;
    private Double salario;

    public Funcionario(String nome, String identificacao, String nascimento, Double salario) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.nascimento = nascimento;
        this.salario = salario;
    }

    public String getNome() { return nome;}

    public void setNome(String nome) { this.nome = nome; }

    public String getIdentificacao() {return identificacao;}

    public void setIdentificacao(String identificacao) {this.identificacao = identificacao; }

    public String getNascimento() { return nascimento;}

    public void setNascimento(String nascimento) {this.nascimento = nascimento;}

    public String getSalarioVisualizar() { return formataReal(salario);}
    public Double getSalario(){ return salario;}

    public void setSalario(Double salario) { this.salario = salario; }

    public abstract String getBonificacao();

    public String formataReal(Double x){
        return String.format("R$%,.2f", x);
    }
}
