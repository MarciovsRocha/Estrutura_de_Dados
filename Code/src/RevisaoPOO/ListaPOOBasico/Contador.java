package RevisaoPOO.ListaPOOBasico;

public class Contador {
    private int cont;

    public Contador(){
        this.cont = 0;
    }

    public Contador(int cont){
        this.cont = cont;
    }

    public void incrementar(){
        this.cont++;
    }

    public void zerar(){
        this.cont = 0;
    }

    public void setContador(int cont){
        this.cont = cont;
    }

    public int getContador(){
        return this.cont;
    }

}
