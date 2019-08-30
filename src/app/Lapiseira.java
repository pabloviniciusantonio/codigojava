package app;

public class Lapiseira extends ProdutoAcabado {
    private float ponta;

    public Lapiseira(String nome, float valor, String modelo, int quantidade, String cor, float ponta) {
      this.setNome(nome);
      this.setValor(valor);
      this.setModelo(modelo);
      this.setQuantidade(quantidade);
      this.setCor(cor);
      this.setPonta(ponta);
        
    }
    
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public float getPonta() {
        return ponta;
    }
    
    
}
