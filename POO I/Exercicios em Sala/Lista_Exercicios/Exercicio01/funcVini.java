/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunodev07
 */
public class funcVini {
    
    public static void main(String[] args) {
        
        Funcionario Vini = new Funcionario();
        
        System.out.println("Cadastro de novo funcionario...");
        
        Vini.nome = "Vinicius";
        System.out.println("Nome: " + Vini.nome);
        
        Vini.cargoAtual = "Aluno";
        System.out.println("Cargo: " + Vini.cargoAtual);
        
        System.out.print("Funcao: ");
        Vini.cadastrar();
        
        Vini.matricula = 202201737;
        System.out.println("Matricula: " + Vini.matricula);
        
        Vini.salarioAtual = 314.88f;
        System.out.println("Salario: " + Vini.salarioAtual);
        
        Vini.dependentes();
        
        Vini.consultar();
       
        Vini.atualizarSalario(500.90f);
        
        
        
        
        
    }
    
}
