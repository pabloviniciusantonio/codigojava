package app;

public class ProdutoAcabado extends Produto {
    private int estoquetotal;
    private String cor;
    private String modelo;
    private int quantidade;
    
    public void setCor(String cor) {
        this.cor = cor;
}
    public String getCor() {
        return this.cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.setEstoqueTotal(quantidade);
    }
    public int getQuantidade() {
        return this.quantidade;
    }

    public int getEstoqueTotal() {
        return estoquetotal;
    }

    public void setEstoqueTotal(int estoquetotal) {
        this.estoquetotal = estoquetotal;
    }
    
    
    
    
}
