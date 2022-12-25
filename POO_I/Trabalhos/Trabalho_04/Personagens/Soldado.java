public class Soldado extends Personagem {
    
    // Sobrescrevendo Personagem
    @Override
    public void especial(){
        System.out.println("""
                                      BOOOOMM
                                       --_--
                                    (  -_    _).
                                  ( ~       )   )
                                (( )  (    )  ()  )
                                 (.   )) (       )
                                   ``..     ..``
                                        | |
                                      (=| |=)
                                        | |         
                                    (../( )\\.))""");
    }
    @Override
    public void desenhar(){
        System.out.println("""
                                  .---.
                             ___ /_____\\
                            /\\.-`( '.' )
                           / /    \\_-_/_
                           \\ `-.-"`'V'//-.
                            `.__,   |// , \\
                                |Ll //Ll|\\ \\
                                |__//   | \\_\\
                               /---|[]==| / /
                               \\__/ |   \\/\\/
                               /_   | Ll_\\|
                                |`^\"""^`|
                                |   |   |
                                |   |   |
                                |   |   |
                                |   |   |
                                L___l___J
                                 |_ | _|
                                (___|___)
                                 ^^^ ^^^""");
    }
    
    // Método único de Soldado
    public void plantarBombas(){
        System.out.println("""
                           
                                                     \\         .  ./
                                                     \\      .:";'.:.."   /
                                                           (M^^.^~~:.'").
                                                    -    (/  .    . . \\ \\)  -
                             O                          ((| :. ~ ^  :. .|))
                            |\\                      -   (\\- |  \\ /  |  /)  -
                            |  T                          -\\  \\     /  /-
                           / \\[_]..........................\\  \\   /  /""");
    }
    public void largarArma(){
        System.out.println("\nSoldado - Largando arma...");
    }
    
}
