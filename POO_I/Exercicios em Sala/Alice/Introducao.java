/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author alunodev07
 */
public class Introducao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /* INPUT */
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Digite a sua idade");        
        int idade = teclado.nextInt();

        /* CONDICIONAL IF/ELSE */
        if(idade >= 18){
            System.out.println("Pode entrar no boteco...");
        }
        else {
            System.out.println("Vai pra casa...");
        }
        
        /* ESTRUTURA DE REPETIÇÃO */
        int i = 0;
        while(i < 5){
            System.out.println("Devo tirar 10 na prova...");
            i += 1;
        }
        
        
        }
        
            
        
        
        
    }
