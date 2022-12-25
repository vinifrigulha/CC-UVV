
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunodev07
 */
public class Funcionario {
    
    // Atributos da Classe Funcionario
    
    int matricula;
    String nome, cargoAtual;
    float salarioAtual;
    
    // Métodos da Classe Funcionario
    
    void cadastrar(){
        
        System.out.println("Cadastro de notas fiscais");
        
    }
    
    List consultar(){
        
        return null;
        
    }
    
    void atualizarSalario(float novoSalario){
        
        novoSalario += 1000;
        
    }
    
    List dependentes(){
        
        System.out.println("Lista de dependentes");
        
        return null;
        
    }
    
}
