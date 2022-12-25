
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunodev07
 */
public class AgendaTelefonica {
    
    Map<String, Contato> colecao = new HashMap<>();
    
    void inserir(String nome, Contato numero){
        colecao.put(nome, numero);
    }
    
    Contato buscar(String nome) {
        return colecao.get(nome);
    }
    
    void remover(String nome) {
        
    }
    
    int tamanho() {
        return colecao.size();
    }
    
    
            
            
    
    
    
    
    
    
}
