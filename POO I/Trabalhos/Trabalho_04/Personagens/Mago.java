public class Mago extends Personagem {
    
    // Sobrescrevendo Personagem
    @Override
    public void especial(){
        System.out.println("\nMago - Fica invuneravel por um tempo");
    }
    @Override
    public void desenhar(){
        System.out.println("""
                                                ____ 
                                             .'* *.'
                                          __/_*_*(_
                                         / _______ \\
                                        _\\_)/___\\(_/_ 
                                       / _((\\- -/))_ \\
                                       \\ \\())(-)(()/ /
                                        ' \\(((()))/ '
                                       / ' \\)).))/ ' \\
                                      / _ \\ - | - /_  \\
                                     (   ( .;''';. .'  )
                                     _\\"__ /    )\\ __"/_
                                       \\/  \\   ' /  \\/
                                        .'  '...' ' )
                                         / /  |  \\ \\
                                        / .   .   . \\
                                       /   .     .   \\
                                      /   /   |   \\   \\
                                    .'   /    b    '.  '.
                                _.-'    /     Bb     '-. '-._ 
                            _.-'       |      BBb       '-.  '-. 
                           (________mrf\\____.dBBBb.________)____)""");
    }
    
    // Métodos únicos do Mago
    public void conhecimento(){
        System.out.println("\nMago - Conhecimento");
    }
    public void criarFeitiços(){
        System.out.println("""
                               /^\\     .
                               /\\   "V"
                              /__\\   I      O  o
                             //..\\\\  I     .
                             \\.`[/   I
                             /l\\/j\\  (]    .  O
                            /. ~~ ,\\/I          .
                            \\\\L__j^\\/I       o
                             \\/--v}  I     o   .
                             |    |  I   _______
                             |    |  I c(`     ')o
                             |    l  I  \\.    ,/
                           _/j  L l\\_! _//^---^\\\\_""");
    }
    public void teletransportar(){
        System.out.println("\nMago - Teletransporta a si proprio a curtas distancias");
    }
    public void curarAliados(){
        System.out.println("\nMago - Cura aliados proximos");
    }

}
