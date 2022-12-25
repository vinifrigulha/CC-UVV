public abstract class Personagem {
    
    Arma_IF arma;

    public void setArma(Arma_IF arma) {
        this.arma = arma;
    }
    
    public void desenhar(){
        System.out.println("Personagem - Desenhando personagem...");
    }
    public void correr(){
        System.out.println("""
                           
                                                    ,////,
                                                   /// 6|
                                                   //  _|
                                                  _/_,-'
                                             _.-/'/   \\   ,/;,
                                          ,-' /'  \\_   \\ / _/
                                          `\\ /     _/\\  ` /
                                            |     /,  `\\_/
                                            |     \\'
                                /\\_        /`      /\\
                              /' /_``--.__/\\  `,. /  \\
                             |_/`  `-._     `\\/  `\\   `.
                                       `-.__/'     `\\   |
                                                     `\\  \\
                                                       `\\ \\
                                                         \\_\\__
                                                          \\___)""");
    }
    public void arma(){
        arma.usarArma();
    }
    public void falar(){
        System.out.println("""
                            _________________________________________
                           / Lorem ipsum dolor sit amet,             \\
                           | consectetuer adipiscing elit! Aenean    |
                           | commodo ligula eget dolor? Aenean       |
                           | massa; Cum sociis natoque penatibus et  |
                           | magnis dis parturient montes, nascetur  |
                           | ridiculus mus? Donec quam felis,        |
                           | ultricies nec, pellentesque eu, pretium |
                           \\ quis, sem!                              /
                            -----------------------------------------
                                   \\   
                                    \\
                           """);
    }
    public void especial(){
        System.out.println("\nPersonagem - Poder Especial");
    }
    public void morrer(){
        System.out.println("""
                                            (    )
                                            __)(__
                                      _____/      \\\\_____
                                     |                  ||
                                     |  _     ___   _   ||
                                     | | \\     |   | \\  ||
                                     | |  |    |   |  | ||
                                     | |_/     |   |_/  ||
                                     | | \\     |   |    ||
                                     | |  \\    |   |    ||
                                     | |   \\. _|_. | .  ||
                                     |                  ||
                             *       | *   **    * **   |**      **
                              \\))(/(/.,(//,,..,,\\||(,,.,\\\\,.((//""");
    }

}
