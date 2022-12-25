public class Pistola implements Arma_IF {

    @Override
    public void usarArma() {
        System.out.println("""
                           
                            \\
                            /                                 />
                            \\__+_____________________/\\/\\___/ /|
                            ()______________________      / /|/\\
                                        /0 0  ---- |----    /---\\
                                       |0 o 0 ----|| - \\ --|      \\
                                        \\0_0/____/ |    |  |\\      \\
                                                    \\__/__/  |      \\
                           BANG! BANG!                       |       \\
                                                             |         \\
                                                             |__________|""");
    }
    
}
