
package app;

public class MateriaPrima extends Produto {
    
    private float taxa;
    private int   estoque;
    
    //construtor
    public MateriaPrima(String nome){
        this.estoque = 0;
        super.setNome(nome);
    }
    
    public int addQtd(int qtd){
        this.estoque = this.getEstoque() + qtd;
        return this.getEstoque();
    }
    
    public int subQtd(int qtd){
        this.estoque = this.getEstoque() + qtd;
        return this.getEstoque();
    }
    
    public float getValorImposto(){
        //TODO: alterar para um atributo valor        
        return (float) (this.getEstoque()*1.5)*this.getTaxa();
    }
    
    public float getValorImposto(float taxa){
        //TODO: alterar para um atributo valor 
        this.setTaxa(taxa);
        return (float) (this.getEstoque()*1.5)*this.getTaxa();
    }
    
    public void setNome(String nome){
        
        if (this.getEstoque() == 0){
            super.setNome(nome);
        }else {
            System.out.println("..|ERRO: Nome produto nao pode ser alterado com estoque maior que 0");
        } 
    }
    
    public void setTaxa(float taxa){ 
        this.taxa = taxa;
    }
    
    public float getTaxa(){ 
        return this.taxa;
    }
    
    public void setEstoque(int estoque){
        
        if (this.estoque == 0){
            this.estoque = estoque;   
        } else {
            System.out.println("..|ERRO: Materia Prima ja possui qtd em estoque");
        }
    }
    
    public int getEstoque() {
        return this.estoque;
    }
}
