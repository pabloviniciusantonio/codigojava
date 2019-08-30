
package app;
//###==============================###\\
// Para criar um objeto voce deve definir
// tipo dele (caneta, lapiseira)
// colocar um preço
// colocar a marca
// definir a quantidade
// --caneta--
// escolha uma cor
// escolha o tipo (mecanico ou comtampa)
// --lapiseira--
// escolha uma cor
// escolha se ela e 0.5 ou 0.7
//###==============================###\\
public class Main {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("Caneta", 2.5f, "BIC", 50, "Azul", "mecanico");
        Caneta c2 = new Caneta("Caneta", 2.5f, "BIC", 50, "Azul", "mecanico");
        Caneta c3 = new Caneta("Caneta", 2.5f, "BIC", 50, "Azul", "mecanico");
        
        
        c1.objetos();
        c2.objetos();
        c3.objetos();
        
        System.out.println(c1.getEstoqueTotal());
        
       //MateriaPrima mp = new MateriaPrima("Laranja");
        
        /***
        System.out.println(mp.getEstoque());
        mp.setEstoque(100);
        System.out.println(mp.getEstoque());
        mp.setEstoque(200);
        System.out.println(mp.getEstoque());
        */
        
        //
        
        //System.out.println(mp.getNome());
        //System.out.println(mp.getEstoque());
        //mp.setNome("Morango");
        //System.out.println(mp.getNome());
        //mp.setEstoque(100);
        //mp.setNome("Banana");
        
        //System.out.println(mp.getEstoque());
        //mp.addQtd(20);
        //System.out.println(mp.getEstoque());
        //mp.addQtd(18);
        //System.out.println(mp.getEstoque());
        //mp.subQtd(25);
        //System.out.println(mp.getEstoque());
        
        //System.out.println("..|end application");
    }
    
}
