public class Usuario {
    
    String nome, usuario;
    int id, senha;
    
    public class Aluno extends Usuario{
    public Aluno(String _nome, String _usuario, int _id, int _senha){
        super(_nome, _usuario, _id, _senha);
        }
    public String curso;
    }
    
    public class Professor extends Usuario{
    public Professor(String _nome, String _usuario, int _id, int _senha){
        super(_nome, _usuario, _id, _senha);
    }
    public void uparTrabalho(){   
        }
    public void editarTrabalho(){
        }
    }
    
    public class Coordenador extends Usuario{
    public Coordenador(String _nome, String _usuario, int _id, int _senha){
        super(_nome, _usuario, _id, _senha);
        }
    public String curso;
    public void bloquearAluno(){ 
        }
    public void removerComentario(){   
        }
    }
    
    public void curtir(){
        
    }
    
    public void comentar(){
        
    }
    
    public void visualizar(){
        
    }
    
    public void setNome(){
        
    }
    
    public void getNome(){
        
    }
    
    public void setId(){
        
    }
    
    public void getId(){
        
    }
    
    public void download(){
        
    }
    
}
