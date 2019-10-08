/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author Carol
 */
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(12345);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.sacar(1000);
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(67890);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.fecharConta();
        p2.estadoAtual();
    }
    
}
