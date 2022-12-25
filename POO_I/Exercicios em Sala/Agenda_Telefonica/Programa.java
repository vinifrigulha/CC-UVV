/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunodev07
 */
public class Programa {
    public static void main(String[] args) {
        
        Contato c01 = new Contato();
        c01.nome = "Vinicius";
        c01.apelido = "Prof";
        c01.quantoTaMeDevendo = 100;
        c01.email = "c01@email.com";
        c01.numTel = "9999-9999";
        
        Contato c02 = new Contato("Rosalen", "UVV", 200);
        
        
        AgendaTelefonica ag = new AgendaTelefonica();
        
        ag.inserir("Vinicius", c01);
        ag.inserir("Mariana", c02);
        
        
        System.out.println(ag.buscar("Vinicius").numTel);
        System.out.println(ag.buscar("Vinicius").quantoTaMeDevendo);
        
        System.out.println(ag.tamanho());
        
        
    }
    
    
}
