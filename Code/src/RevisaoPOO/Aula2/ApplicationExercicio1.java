package RevisaoPOO.Aula2;

public class ApplicationExercicio1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Joao das Couves", "123.456.789-10","+55 (41) 9 9999-9999");
        System.out.print(p2.getNome() + '\n');
        Funcionario f3 = new Funcionario("Vilmago","123.465.789-20","+55 (41) 9 9455-4561",10);
    }

}
