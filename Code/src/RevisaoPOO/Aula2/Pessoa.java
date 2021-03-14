package RevisaoPOO.Aula2;
// exercicio 1
public class Pessoa {
    private String nome;
    private String CPF;
    private String telefone;

    public Pessoa(String nome, String cpf, String telefone){
        this.nome = nome;
        this.CPF = cpf;
        this.telefone = telefone;
    }

    public Pessoa(){
        this.nome = null;
        this.CPF = null;
        this.telefone = null;
    }

    public void setNome(String NovoNome){ this.nome = NovoNome; }

    public void setCPF(String NovoCPF){ this.CPF = NovoCPF; }

    public void setTelefone(String NovoTelefone){ this.telefone = NovoTelefone; }

    public String getNome(){ return this.nome; }

    public String getCPF(){ return this.CPF; }

    public String getTelefone(){ return this.telefone; }


}
