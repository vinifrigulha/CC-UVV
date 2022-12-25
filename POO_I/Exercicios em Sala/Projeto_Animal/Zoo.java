public class Zoo {
    
    public static void main(String[] args) {
        
        System.out.println(" == SerVivo == ");
        SerVivo sv = new SerVivo();
        sv.nascer();
        sv.crescer();
        sv.morrer();
        
        System.out.println("");
        System.out.println(" == Animal == ");
        Animal an = new Animal();
        an.nascer();
        an.mover();
        an.respirar();
        an.crescer();
        an.morrer();
        
        System.out.println("");
        System.out.println(" == Mamifero == ");
        Mamifero ma = new Mamifero();
        ma.nascer();
        ma.crescer();
        ma.mover();
        ma.respirar();
        ma.morrer();
        
        System.out.println("");
        System.out.println(" == Peixe == ");
        Peixe px = new Peixe();
        px.respirar();
        px.nadar();
        
        System.out.println("");
        System.out.println(" == Inseto == ");
        Inseto in = new Inseto();
        in.morrer();
        
        
    }
    
}
