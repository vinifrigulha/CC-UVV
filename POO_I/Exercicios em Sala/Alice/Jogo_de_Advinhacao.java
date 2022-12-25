/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
/**
 *
 * @author alunodev07
 */
public class Jogo_de_Advinhacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);   // Ler o teclado do usuário
        int ns = 10;
        int tentativa = 0;
        int chute = 0;
        
        while (chute != ns && tentativa < 16) {
            System.out.print("Digite um numero qualquer: ");
            chute = teclado.nextInt();
            tentativa += 1;
            
            if (chute == ns) {
                System.out.println("PARABENS! Voce acertou na " + tentativa + " tentativa!!");
            }
            else {
                if (tentativa >= 3 && tentativa <= 5) {
                System.out.println("DICA 01: Tente um numero entre 1 e 1000...");
                }
                else if (tentativa >= 8 && tentativa <= 10) {
                    System.out.println("DICA 02: Tente um numero entre 1 e 100...");
                }
                else if (tentativa >= 13 && tentativa < 16) {
                    System.out.println("DICA 03: Tente um numero entre 1 e 10...");
                }
                System.out.println("HAHAHAHA! Voce errou!!!");
            }    
        }
        System.out.println("FIM DO JOGO");
    }
        
}
    
