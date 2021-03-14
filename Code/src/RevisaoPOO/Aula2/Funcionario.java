package RevisaoPOO.Aula2;
// exercicio 2
public class Funcionario extends Pessoa{
    private int matricula;
    public Funcionario(String nome, String CPF, String telefone, int matricula){
        super(nome,CPF,telefone);
        this.matricula = matricula;
    }

    public int getMatricula(){ return this.matricula; }

    public void setMatricula(int NovaMatricula){ this.matricula = NovaMatricula; }
}
