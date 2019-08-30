
package app;

public class Produto {
    
    //relacao de atributos da classe 
    private String nome;  // nome do produto
    private float  valor; // valor do produto
    
    //por meio dos metodos cria-se uma interface de acesso aos dados
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
}
