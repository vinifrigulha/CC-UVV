/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author alunodev07
 */
public class Alice {
    
    float tamanho;
    String corCabelo;
    int posX, posY, posZ;
    
    boolean mover() {
        System.out.println("Alice : move()");
        return true;
    }
    void turn() {
        System.out.println("Alice : vira()");
        
    }
    void say(String texto) {
        System.out.println("Alice : " + texto);
    }
}
