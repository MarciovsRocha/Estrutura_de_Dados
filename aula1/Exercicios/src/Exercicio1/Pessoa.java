package Exercicio1;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Pessoa(){
        this.nome = null;
        this.cpf = null;
        this.telefone = null;
    }

}
