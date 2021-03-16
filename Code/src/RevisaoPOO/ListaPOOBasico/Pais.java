package RevisaoPOO.ListaPOOBasico;

import java.util.ArrayList;

public class Pais {
    private String codigo;
    private String nome;
    private int populacao;
    private int extensao;
    ArrayList <Pais> fronteira;

    public Pais(String codigo, String nome, int populacao, int extensao, ArrayList<Pais> fronteira){
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
        this.extensao = extensao;
        this.fronteira = new ArrayList<>();
        this.fronteira = fronteira;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public int getPopulacao(){
        return this.populacao;
    }

    public int getExtensao(){
        return this.extensao;
    }

    public ArrayList<Pais> getFronteira(){
        return this.fronteira;
    }

    public void FronteiraAddPais(Pais pais){
        this.fronteira.add(pais);
    }

    public void FronteiraRemovePais(){

    }

}
