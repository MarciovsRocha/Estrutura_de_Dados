package RevisaoPOO.ListaPOOBasico;

public class TestExercicios {
    public static void main(String[] args){
        /*
        * Teste da Classe Contador
        */
        Contador c1 = new Contador();
        System.out.println(c1.getContador());
        c1.incrementar();
        c1.incrementar();
        System.out.println(c1.getContador());
        c1.zerar();
        System.out.println(c1.getContador());
        c1.setContador(20);
        System.out.println(c1.getContador());

        Contador c2 = new Contador(110);
        System.out.println(c2.getContador());
        c2.incrementar();
        c2.incrementar();
        c2.incrementar();
        c2.incrementar();
        c2.incrementar();
        c2.incrementar();
        System.out.println(c2.getContador());
        c2.zerar();
        System.out.println(c2.getContador());
        c2.setContador(60);
        System.out.println(c2.getContador());

        /*
        * Teste da Classe Pais
        */
    }
}
