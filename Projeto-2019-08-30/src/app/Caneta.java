package app;

public class Caneta extends ProdutoAcabado {
    private String tipo;

    public Caneta(String nome, float valor, String modelo, int quantidade, String cor, String tipo) {
        this.setNome(nome);
        this.setValor(valor);
        this.setModelo(modelo);
        this.setQuantidade(quantidade);
        this.setCor(cor);
        this.tipoCaneta(tipo);
    }
    public void tipoCaneta(String t){
        if (t == "mecanico") {
            this.setTipo("Mecanico");
        } else if (t == "comtampa") {
            this.setTipo("Com Tampa");
        } else {
            this.setTipo("Defina um tipo");
        }
        
    }
    public void objetos(){
        System.out.println("Objeto " + this.getNome());
        System.out.println("Preço " + this.getValor());
        System.out.println("Marca " + this.getModelo());
        System.out.println("Cor " + this.getCor());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Quantidade em estoque " + this.getQuantidade());
    }
    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    
}
