package interfaces;

public class Inquilino {

    public String nome;
    public String cpf;

    public Inquilino(String nome, Integer cpf){
        this.cpf = validaCpf(cpf);
        this.nome = nome;
    }

    private String validaCpf (Integer cpf){
        if(cpf.intValue() == 11){
            return cpf.toString();
        }else {
            return "erro";
        }
    }
}
