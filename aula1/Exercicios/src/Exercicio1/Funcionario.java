package Exercicio1;

public class Funcionario extends Pessoa{
    private int matricula;
    public Funcionario(String nome, String cpf, String telefone, int matricula){
        super(nome,cpf,telefone);
        this.matricula = matricula;
    }
}
