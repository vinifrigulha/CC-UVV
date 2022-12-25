import java.util.Scanner;
import java.util.Random;

public class PlayGame {
    
    public static void main(String[] args) {
        
        // Variáveis do programa
        Scanner sc = new Scanner(System.in);
        int op0 = -1; // Opcao do estilo de jogo
        
        // Variáveis do modo "Testar Personagens"
        int op1 = -1; // Opcao inicial
        int op2 = -1; // Opcao das acoes do personagem
        int op3 = -1; // Opcao das armas
        String info = ("""
                           \n=-=-=-= INFORMACOES SOBRE CADA PERSONAGEM =-=-=-=
                           
                           =-=-= SOLDADO =-=-=
                           Indicado para jogadores amadores que gostam de acao em combate.
                           Utiliza faca e todas as armas de fogo, alem de dar
                           soco e chute quando desarmado.
                           
                           HABILIDADE: Plantar bombas.  
                           ESPECIAL: Jogar uma granada.
                           
                           
                           =-=-= GENERAL =-=-=
                           Indicado para jogadores um pouco mais experientes.
                           Faz tudo o que o SOLDADO faz, mas com outros comandos
                           especificos para a sua patente.
                           Utiliza faca e todas as armas de fogo, alem de dar
                           soco e chute quando desarmado.
                           
                           HABILIDADES: Plantar bombas e Tanque de Guerra.
                           ESPECIAL: Chamar ataque aereo.
                           
                           
                           =-=-= LUTADOR DE SUMO =-=-=
                           Indicado para jogadores que gostam de um desafio.
                           O LUTADOR DE SUMO nao utiliza nenhuma arma, mas ele 
                           ainda tem grande poder mesmo desarmado.
                           
                           HABILIDADE: Quebrar estruturas densas.
                           ESPECIAL: Barrigada.
                           
                           
                           =-=-= MAGO =-=-=
                           Indicado para jogadores que gostam de dar suporte a equipe.
                           O MAGO nao utiliza nenhuma arma, nem mesmo dar soco e chute.
                           A sua arma eh exclusiva, e esta no seu bastao, atirando
                           poder magico dele para dar dano, e tambem ajudar os aliados.
                           
                           HABILIDADES: Conhecimento, Criar Feiticos, Teletransportar e Curar Aliados.
                           ESPECIAL: Invulnerabilidade.
                           
                           
                           =-=-= DRAGAO ALADO =-=-=
                           Indicado para jogadores que querem "torrar" os inimigos mais rapidamente.
                           O DRAGAO ALADO nao utiliza armas. Afinal, para que usar uma arma
                           quando se tem um poder de cuspir fogo nos inimigos?
                           
                           HABILIDADES: Transportar aliados e Voar.
                           ESPECIAL: Cuspir Lava.
                           """);
        
        // Variáveis do modo "Soldado x Dragao"
        Random rd = new Random(); // Gerar valor aleatorio
        int opUser = -1; // Opcao do usuario
        
        
        //////////////////////////////////////////////////////////////////////////////////////////////////
        
        // Programa
        while (op0 != 0) {
            
            System.out.println("""
                               \n=-=-=-= MENU INICIAL =-=-=-=
                               
                               Escolha uma opcao de jogo:
                               
                               1 - Testar Personagens
                               2 - Soldado x Dragao
                               
                               0 - Sair do Programa
                               """);
            
            System.out.println("Digite a sua opcao aqui: ");
            op0 = sc.nextInt();
            
            switch (op0) {
                case 0 -> {
                    break;
                }
                
                ///////////////////////////////////////////////////////////////////////////////////////////////////
                // Modo de jogo "Testar Personagens"
                
                case 1 -> {
                    
                    while (op1 != 0) {
                        System.out.println("""
                                           \n=-=-=-= TESTAR PERSONAGENS =-=-=-=
                                           
                                           Escolha um personagem:
                                           
                                           1 - Soldado
                                           2 - General
                                           3 - Lutador de Sumo
                                           4 - Mago
                                           5 - Dragao Alado
                                           
                                           6 - Conhecer Personagens e suas Habilidades
                                           
                                           0 - Voltar ao Menu Inicial
                                           """);
                        
                        System.out.println("Digite a sua opcao aqui: ");
                        op1 = sc.nextInt();
                        
                        switch (op1) {
                            case 0 -> {
                                break;
                            }
                            
                            ///////////////////////////////////////////////////////////////////////////////////////
                            // SOLDADO:
                            
                            case 1 -> {
                                Soldado sol = new Soldado();
                                sol.desenhar();
                                
                                while (op2 != 0) {
                                    
                                    System.out.println("""
                                                       \n=-=-=-= SOLDADO =-=-=-=
                                                       
                                                       Escolha uma acao:
                                                       
                                                       1 - Falar
                                                       2 - Correr
                                                       3 - Armar
                                                       4 - Usar Arma
                                                       5 - Largar Arma
                                                       6 - Plantar Bombas
                                                       7 - Especial
                                                       
                                                       0 - Trocar de Personagem
                                                       """);
                                    
                                    System.out.println("\nDigite a sua opcao aqui: ");
                                    op2 = sc.nextInt();
                                    
                                    switch (op2) {
                                        case 0 -> {
                                            sol.morrer();
                                            System.out.println("\nVoltando ao menu anterior...");
                                            break;
                                        }
                                        case 1 -> {
                                            sol.falar();
                                        }
                                        case 2 -> {
                                            sol.correr();
                                        }
                                        case 3 -> {
                                            if (op3 >= 1 && op3 <= 4) {
                                                System.out.println("\nVoce ja esta armado!");
                                            }
                                            else {
                                                while (op3 < 1 || op3 > 4){
                                                    System.out.println("""
                                                                       \n=-=-=-= ARMAMENTO =-=-=-=

                                                                       Escolha uma arma:

                                                                       1 - Soco
                                                                       2 - Faca
                                                                       3 - Pistola
                                                                       4 - Fuzil
                                                                       """);
                                                    System.out.println("\nDigite a sua opcao aqui: ");
                                                    op3 = sc.nextInt();

                                                    if (op3 < 0 || op3 > 4) {
                                                        System.out.println("\nOpcao invalida. Tente novamente.");
                                                    }
                                                }
                                                System.out.println("\nArma SELECIONADA!");
                                            }
                                        }
                                        case 4 -> {
                                            switch (op3) {
                                                case -1 -> {
                                                    System.out.println("\nNenhuma arma equipada. Equipe antes de usar!");
                                                }
                                                case 1 -> {
                                                    Desarmado des = new Desarmado();
                                                    des.usarArma();
                                                }
                                                case 2 -> {
                                                    Faca faca = new Faca();
                                                    faca.usarArma();
                                                }
                                                case 3 -> {
                                                    Pistola pis = new Pistola();
                                                    pis.usarArma();
                                                }
                                                case 4 -> {
                                                    Fuzil fuz = new Fuzil();
                                                    fuz.usarArma();
                                                }
                                            }
                                        }
                                        case 5 -> {
                                            if (op3 == -1) {
                                                System.out.println("\nVoce nao esta armado. Tenha uma arma para larga-la.");
                                            }
                                            else {
                                                sol.largarArma();
                                                op3 = -1;
                                            }
                                        }
                                        case 6 -> {
                                            sol.plantarBombas();
                                        }
                                        case 7 -> {
                                            sol.especial();
                                        }
                                        default -> System.out.println("\nOpcao invalida. Tente novamente.");
                                    }
                                }
                                op1 = -1;
                                op2 = -1;
                                op3 = -1;
                            }
                            
                            ///////////////////////////////////////////////////////////////////////////////////////
                            // GENERAL:
                            
                            case 2 -> {
                                General gen = new General();
                                gen.desenhar();
                                
                                while (op2 != 0) {
                                    
                                    System.out.println("""
                                                       \n=-=-=-= GENERAL =-=-=-=
                                                       
                                                       Escolha uma acao:
                                                       
                                                       1 - Falar
                                                       2 - Correr
                                                       3 - Armar
                                                       4 - Usar Arma
                                                       5 - Largar Arma
                                                       6 - Plantar Bombas
                                                       7 - Tanque de Guerra
                                                       8 - Especial
                                                       
                                                       0 - Trocar de Personagem
                                                       """);
                                    
                                    System.out.println("\nDigite a sua opcao aqui: ");
                                    op2 = sc.nextInt();
                                    
                                    switch (op2) {
                                        case 0 -> {
                                            gen.morrer();
                                            System.out.println("\nVoltando ao menu anterior...");
                                            break;
                                        }
                                        case 1 -> {
                                            gen.falar();
                                        }
                                        case 2 -> {
                                            gen.correr();
                                        }
                                        case 3 -> {
                                            if (op3 >= 1 && op3 <= 4) {
                                                System.out.println("\nVoce ja esta armado!");
                                            }
                                            else {
                                                while (op3 < 1 || op3 > 4){
                                                    System.out.println("""
                                                                       \n=-=-=-= ARMAMENTO =-=-=-=

                                                                       Escolha uma arma:

                                                                       1 - Soco
                                                                       2 - Faca
                                                                       3 - Pistola
                                                                       4 - Fuzil
                                                                       """);
                                                    System.out.println("\nDigite a sua opcao aqui: ");
                                                    op3 = sc.nextInt();

                                                    if (op3 < 0 || op3 > 4) {
                                                        System.out.println("\nOpcao invalida. Tente novamente.");
                                                    }
                                                }
                                                System.out.println("\nArma SELECIONADA!");
                                            }
                                        }
                                        case 4 -> {
                                            switch (op3) {
                                                case -1 -> {
                                                    System.out.println("\nNenhuma arma equipada. Equipe antes de usar!");
                                                }
                                                case 1 -> {
                                                    Desarmado des = new Desarmado();
                                                    des.usarArma();
                                                }
                                                case 2 -> {
                                                    Faca faca = new Faca();
                                                    faca.usarArma();
                                                }
                                                case 3 -> {
                                                    Pistola pis = new Pistola();
                                                    pis.usarArma();
                                                }
                                                case 4 -> {
                                                    Fuzil fuz = new Fuzil();
                                                    fuz.usarArma();
                                                }
                                            }
                                        }
                                        case 5 -> {
                                            if (op3 == -1) {
                                                System.out.println("\nVoce nao esta armado. Tenha uma arma para larga-la.");
                                            }
                                            else {
                                                gen.largarArma();
                                                op3 = -1;
                                            }
                                        }
                                        case 6 -> {
                                            gen.plantarBombas();
                                        }
                                        case 7 -> {
                                            gen.tanqueDeGuerra();
                                        }
                                        case 8 -> {
                                            gen.especial();
                                        }
                                        default -> System.out.println("\nOpcao invalida. Tente novamente.");
                                    }
                                }
                                op1 = -1;
                                op2 = -1;
                                op3 = -1;
                            }
                            
                            ///////////////////////////////////////////////////////////////////////////////////////
                            // LUTADOR DE SUMO
                            
                            case 3 -> {
                                LutSUMO lut = new LutSUMO();
                                lut.desenhar();
                                Desarmado des = new Desarmado();
                                
                                while (op2 != 0){
                                    
                                    System.out.println("""
                                                       \n=-=-=-= LUTADOR DE SUMO =-=-=-=
                                                       
                                                       Escolha uma acao:
                                                       
                                                       1 - Falar
                                                       2 - Correr
                                                       3 - Usar Arma
                                                       4 - Quebrar Estruturas
                                                       5 - Especial
                                                       
                                                       0 - Trocar de Personagem
                                                       """);
                                    
                                    System.out.println("\nDigite a sua opcao aqui: ");
                                    op2 = sc.nextInt();
                                    
                                    switch (op2) {
                                        case 0 -> {
                                            lut.morrer();
                                            System.out.println("\nVoltando ao menu anterior...");
                                            break;
                                        }
                                        case 1 -> {
                                            lut.falar();
                                        }
                                        case 2 -> {
                                            lut.correr();
                                        }
                                        case 3 -> {
                                            des.usarArma();
                                        }
                                        case 4 -> {
                                            lut.quebrarEstruturas();
                                        }
                                        case 5 -> {
                                            lut.especial();
                                        }
                                        default -> System.out.println("\nOpcao invalida. Tente novamente.");
                                    } 
                                }
                                op1 = -1;
                                op2 = -1;
                            }
                            
                            ///////////////////////////////////////////////////////////////////////////////////////
                            // MAGO:
                            
                            case 4 -> {
                                Mago mago = new Mago();
                                mago.desenhar();
                                Encantamento enc = new Encantamento();
                                
                                while (op2 != 0) {
                                    
                                    System.out.println("""
                                                       \n=-=-=-= MAGO =-=-=-=
                                                       
                                                       Escolha uma acao:
                                                       
                                                       1 - Falar
                                                       2 - Correr
                                                       3 - Usar Ataque Magico
                                                       4 - Conhecimento
                                                       5 - Criar Feitico
                                                       6 - Teletransportar
                                                       7 - Curar Aliados
                                                       8 - Usar Especial
                                                       
                                                       0 - Trocar de Personagem
                                                       """);
                                    
                                    System.out.println("\nDigite a sua opcao aqui: ");
                                    op2 = sc.nextInt();
                                    
                                    switch (op2) {
                                        case 0 -> {
                                            mago.morrer();
                                            System.out.println("\nVoltando ao menu anterior...");
                                            break;
                                        }
                                        case 1 -> {
                                            mago.falar();
                                        }
                                        case 2 -> {
                                            mago.correr();
                                        }
                                        case 3 -> {
                                            enc.usarArma();
                                        }
                                        case 4 -> {
                                            mago.conhecimento();
                                        }
                                        case 5 -> {
                                            mago.criarFeitiços();
                                        }
                                        case 6 -> {
                                            mago.teletransportar();
                                        }
                                        case 7 -> {
                                            mago.curarAliados();
                                        }
                                        case 8 -> {
                                            mago.especial();
                                        }
                                        default -> System.out.println("\nOpcao invalida. Tente novamente.");
                                    } 
                                }
                                op1 = -1;
                                op2 = -1;
                            }
                            
                            ///////////////////////////////////////////////////////////////////////////////////////
                            // DRAGAO ALADO
                            
                            case 5 -> {
                                DragaoAlado drag = new DragaoAlado();
                                drag.desenhar();
                                BolaDeFogo bdf = new BolaDeFogo();
                                
                                while (op2 != 0) {
                                    
                                    System.out.println("""
                                                       \n=-=-=-= DRAGAO ALADO =-=-=-=
                                                       
                                                       Escolha uma acao:
                                                       
                                                       1 - Falar
                                                       2 - Correr
                                                       3 - Cuspir Fogo
                                                       4 - Voar
                                                       5 - Carregar Aliados
                                                       6 - Usar Especial
                                                       
                                                       0 - Trocar de Personagem
                                                       """);
                                    
                                    System.out.println("\nDigite a sua opcao aqui: ");
                                    op2 = sc.nextInt();
                                    
                                    switch (op2) {
                                        case 0 -> {
                                            drag.morrer();
                                            System.out.println("\nVoltando ao menu anterior...");
                                            break;
                                        }
                                        case 1 -> {
                                            drag.falar();
                                        }
                                        case 2 -> {
                                            drag.correr();
                                        }
                                        case 3 -> {
                                            bdf.usarArma();
                                        }
                                        case 4 -> {
                                            drag.voar();
                                        }
                                        case 5 -> {
                                            drag.carregarAliados();
                                        }
                                        case 6 -> {
                                            drag.especial();
                                        }
                                        default -> System.out.println("\nOpcao invalida. Tente novamente.");
                                    }
                                }
                                op1 = -1;
                                op2 = -1;
                            }
                            
                            ///////////////////////////////////////////////////////////////////////////////////////
                            // INFORMACOES:
                            
                            case 6 -> {
                                System.out.println("\n" + info);
                            }
                            
                            ///////////////////////////////////////////////////////////////////////////////////////
                            // Tratamento de Erro:
                            
                            default -> System.out.println("\nOpcao invalida. Tente novamente.");
                        }
                    }
                    op0 = -1;
                    op1 = -1;
                    System.out.println("\nVoltando ao menu inicial...");
                }
                
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                // Modo de jogo "Soldado x Dragao"
                
                case 2 -> {
                    System.out.println("""
                                       \n=-=-=-= SOLDADO X DRAGAO =-=-=-=
                                       
                                       Um dos Dragoes se rebelou e comeca a atacar as vilas ao redor.
                                       Apenas um nobre Soldado pode vence-lo.
                                       
                                       Assuma o controle dele e salve as pessoas!
                                       """);
                    
                    Soldado sol = new Soldado();
                    sol.desenhar();
                    
                    System.out.println("""
                                       \nEssa nao! O Dragao esta na sua frente!
                                       Ali vem ele!
                                       """);
                    DragaoAlado drag = new DragaoAlado();
                    drag.desenhar();
                    
                    // Status do Usuario:
                    int vidaUser = 100;
                    int a1 = 0;
                    int a2 = 0;
                    int a4 = 0;
                    int a6 = 0;
                    int a7 = 4;
                    int a8 = 5;
                    int rand1;
                    int rand2;
                    int rodada = 0;
                    
                    // Status do Dragao:
                    BolaDeFogo bdf = new BolaDeFogo();
                    int vidaCPU = 300;
                    int vidaCPU_Atual = vidaCPU;
                    int vidaCPU_Hab = 0;
                    int b1 = 0;
                    int b2 = 4;
                    int b3 = 3;
                    
                    //////////////////////////////////////////////////////////////////////////////////
                    // SOLDADO:
                    while (vidaUser > 0 || vidaCPU > 0 || opUser != 0) {
                        System.out.println("\nSua vida atual: " + vidaUser + "HP"); 
                        System.out.println("Vida do Dragao: " + vidaCPU + "HP");
                        System.out.println("\nRODADA ATUAL: " + (rodada+1));
                        if (a1 <= 0 || a2 <= 0 || a4 <= 0 || a6 <= 0 || a7 <= 0 || a8 <= 0) {
                            System.out.println("\n=-=-=-= HABILIDADES DISPONIVEIS =-=-=-=");
                            if (a1 <= 0) {
                                System.out.println("FALAR esta disponivel");
                            }
                            if (a2 <= 0) {
                                System.out.println("CORRER esta disponivel");
                            }
                            if (op3 == -1) {
                                System.out.println("ARMAR esta disponivel");
                            }
                            if (a4 <= 0 && op3 != -1) {
                                System.out.println("USAR ARMA esta disponivel");
                            }
                            if (a6 <= 0) {
                                System.out.println("PLANTAR BOMBA esta disponivel");
                            }
                            if (a7 <= 0) {
                                System.out.println("ESPECIAL esta disponivel");
                            }
                            if (a8 <= 0) {
                                System.out.println("CHAMAR ALIADO esta disponivel");
                            }
                        }
                        
                        System.out.println("""
                                           \n=-=-=-= SOLDADO =-=-=-=
                                           
                                           Escolha uma acao para o SOLDADO:

                                           1 - Falar (Distrai o Dragao por 1 rodada)
                                           2 - Correr (Recupera 10 de vida se tiver levado algum dano)
                                           3 - Armar (Escolhe uma arma)
                                           4 - Usar Arma (So funciona se estiver armado)
                                           5 - Largar Arma (So funciona se estiver armado)
                                           6 - Plantar Bombas (Causa 30 de dano)
                                           7 - Especial (Causa 50 de dano - So pode ser usado apos a 5a rodada)
                                           8 - Chamar um aliado (Causa 60 de dano - So pode ser usado apos a 6a rodada)

                                           0 - Desistir
                                           """);

                        System.out.println("\nDigite a sua opcao aqui: ");
                        opUser = sc.nextInt();
                        
                        switch (opUser) {
                            case 0 -> {
                                vidaUser = 0;
                            }
                            case 1 -> {
                                if (a1 <= 0) {
                                    sol.falar();
                                    System.out.println("\nSeu DISCURSO confundiu o Dragao!! Voce atrasou 1 turno dele!!");
                                    a1 = 2;
                                    b1 += 1;
                                    b2 += 1;
                                    b3 += 1;
                                    a2 -= 1;
                                    a4 -= 1;
                                    a6 -= 1;
                                    a7 -= 1;
                                    a8 -= 1;
                                    vidaCPU_Hab -= 1;
                                }
                                
                            }
                            case 2 -> {
                                if (vidaUser < 100 && a2 <= 0) {
                                    sol.correr();
                                    System.out.println("\nFoi por pouco... Voce recupera 10 de vida!!");
                                    vidaUser += 10;
                                    a2 = 2;
                                    a1 -= 1;
                                    a4 -= 1;
                                    a6 -= 1;
                                    a7 -= 1;
                                    a8 -= 1;
                                    vidaCPU_Hab -= 1;
                                }
                                else {
                                    System.out.println("\nEsta acao nao pode ser usada enquanto sua vida estiver cheia.");
                                } 
                            }
                            case 3 -> {
                                if (op3 >= 1 && op3 <= 4) {
                                    System.out.println("\nVoce ja esta equipado!");
                                }
                                else {
                                    while (op3 < 1 || op3 > 4) {
                                        System.out.println("""
                                                           \n=-=-=-= ARMAMENTO =-=-=-=

                                                           Escolha uma Arma:

                                                           1 - Soco (10 de dano - Sem tempo de recarga)
                                                           2 - Faca (15 de dano - Recarga em 1 rodada)
                                                           3 - Pistola (25 de dano - Recarga em 2 rodadas)
                                                           4 - Fuzil (40 de dano - Recarga em 3 rodadas)
                                                           """);

                                        System.out.println("\nDigite a sua opcao aqui ");
                                        op3 = sc.nextInt();
                                        if (op3 < 1 || op3 > 4) {
                                            System.out.println("\nOpcao invalida. Tente novamente.");
                                        }
                                    }
                                    System.out.println("\nARMA selecionada com sucesso.");
                                }
                            }
                            case 4 -> {
                                if (a4 <= 0) {
                                    switch (op3) {
                                        case -1 -> {
                                            System.out.println("\nNenhuma arma equipada.");
                                        }
                                        case 1 -> {
                                            Desarmado des = new Desarmado();
                                            des.usarArma();
                                            System.out.println("\nSOCO causou 10 de dano!!");
                                            vidaCPU_Atual -= 10;
                                            a1 -= 1;
                                            a2 -= 1;
                                            a6 -= 1;
                                            a7 -= 1;
                                            a8 -= 1;
                                        }
                                        case 2 -> {
                                            Faca faca = new Faca();
                                            faca.usarArma();
                                            System.out.println("\nFACA causou 15 de dano!!");
                                            vidaCPU_Atual -= 15;
                                            a4 = 1;
                                            a1 -= 1;
                                            a2 -= 1;
                                            a6 -= 1;
                                            a7 -= 1;
                                            a8 -= 1;
                                        }
                                        case 3 -> {
                                            Pistola pis = new Pistola();
                                            pis.usarArma();
                                            System.out.println("\nPISTOLA causou 25 de dano!!");
                                            vidaCPU_Atual -= 25;
                                            a4 = 2;
                                            a1 -= 1;
                                            a2 -= 1;
                                            a6 -= 1;
                                            a7 -= 1;
                                            a8 -= 1;
                                        }
                                        case 4 -> {
                                            Fuzil fuz = new Fuzil();
                                            fuz.usarArma();
                                            System.out.println("\nFUZIL causou 40 de dano!!");
                                            vidaCPU_Atual -= 40;
                                            a4 = 3;
                                            a1 -= 1;
                                            a2 -= 1;
                                            a6 -= 1;
                                            a7 -= 1;
                                            a8 -= 1;
                                        }
                                    }
                                }
                                else {
                                    System.out.println("\nNao eh possivel usar essa acao no momento.");
                                }
                                
                            }
                            case 5 -> {
                                if (op3 == -1) {
                                    System.out.println("\nVoce nao esta armado!");
                                }
                                else {
                                    sol.largarArma();
                                    op3 = -1;
                                    a4 = 0;
                                }
                            }
                            case 6 -> {
                                if (a6 <= 0) {
                                    sol.plantarBombas();
                                    System.out.println("\nSuas BOMBAS causaram 30 de dano!!");
                                    vidaCPU_Atual -= 30;
                                    a6 = 4;
                                    a1 -= 1;
                                    a2 -= 1;
                                    a4 -= 1;
                                    a7 -= 1;
                                    a8 -= 1;
                                }
                                else {
                                    System.out.println("\nNao eh possivel usar essa acao no momento.");
                                }
                            }
                            case 7 -> {
                                if (a7 <= 0) {
                                    sol.especial();
                                    System.out.println("\n BOOOM!! Seu ESPECIAL causou 50 de dano!!");
                                    vidaCPU_Atual -= 50;
                                    a7 = 5;
                                    a1 -= 1;
                                    a2 -= 1;
                                    a4 -= 1;
                                    a6 -= 1;
                                    a8 -= 1;
                                }
                                else {
                                    System.out.println("\nNao eh possivel usar essa acao no momento.");
                                }
                            }
                            case 8 -> {
                                if (a8 <= 0) {
                                    rand1 = rd.nextInt(3);
                                    switch (rand1){
                                        case 0 -> {
                                            System.out.println("\nO seu GENERAL vai te ajudar!");
                                            General gen = new General();
                                            gen.desenhar();
                                            rand2 = rd.nextInt(2);
                                            if (rand2 == 0) {
                                                gen.especial();
                                            }
                                            else {
                                                gen.tanqueDeGuerra();
                                            }
                                        }
                                        case 1 -> {
                                            System.out.println("\nUm LUTADOR DE SUMO vai te ajudar!");
                                            LutSUMO lut = new LutSUMO();
                                            lut.desenhar();
                                            lut.correr();
                                        }
                                        case 2 -> {
                                            System.out.println("\nUm MAGO vai te ajudar!");
                                            Mago mago = new Mago();
                                            mago.desenhar();
                                            Encantamento enc = new Encantamento();
                                            enc.usarArma();
                                        }
                                    }
                                    System.out.println("\nSEU ALIADO CAUSOU MUITO DANO! 60 de dano no Dragao!!");
                                    vidaCPU_Atual -= 60;
                                    a1 -= 1;
                                    a2 -= 1;
                                    a4 -= 1;
                                    a6 -= 1;
                                    a7 -= 1;
                                    a8 = 5;
                                }
                                else {
                                    System.out.println("\nNao eh possivel usar essa acao no momento.");
                                }
                            }
                        }
                        
                        ////////////////////////////////////////////////////////////////////////////////////////
                        // DRAGAO:
                        if (vidaCPU_Atual <= 0) {
                            drag.morrer();
                            System.out.println("\nPARABENS!! Voce derrotou o terrivel Dragao!!");
                            System.out.println("\n=-=-=-= FIM DO JOGO =-=-=-=");
                            break;
                        }
                        if (vidaCPU_Hab != 0) {
                            vidaCPU_Atual -= 1;
                        }
                        if (vidaCPU == vidaCPU_Atual && vidaUser > 0) {
                            System.out.println("\nAinda eh seu turno.");
                        }
                        else if (vidaCPU != vidaCPU_Atual && vidaUser > 0){
                            if (b3 <= 0) {
                                System.out.println("\nEssa nao! O Dragao se curou!");
                                drag.voar();
                                vidaCPU_Atual += 40;
                                b3 = 3;
                            }
                            if (b1 <= 0 && b2 <= 0) {
                                drag.carregarAliados();
                                System.out.println("\nOH NAO!! O Dragao usou o seu ESPECIAL!! Ele te causa 30 de dano!");
                                bdf.usarArma();
                                System.out.println("\nTA PEGANDO FOGO BICHO!! Ele te causa 20 de dano!");
                                vidaUser -= 50;
                                b1 = 2;
                                b2 = 4;
                                b3 -= 1;
                            }
                            else if (b1 <= 0 && b2 > 0) {
                                bdf.usarArma();
                                System.out.println("\nTA PEGANDO FOGO BICHO!! Ele te causa 20 de dano!");
                                vidaUser -= 20;
                                b2 -= 1;
                                b1 = 2;
                                b3 -= 1;
                            }
                            else if (b1 > 0 && b2 <= 0) {
                                drag.carregarAliados();
                                System.out.println("\nOH NAO!! O DRAGAO USOU O ESPECIAL!! Ele te causa 30 de dano!");
                                vidaUser -= 30;
                                b2 = 4;
                                b1 -= 1;
                                b3 -= 1;
                            }
                            else {
                                System.out.println("\nDragao ainda nao esta pronto para atacar.");
                                b1 -= 1;
                                b2 -= 1;
                                b3 -= 1;
                            }
                        System.out.println("\n=-=-=-= TURNOS DO DRAGAO =-=-=-=");
                        System.out.println("CUSPIR FOGO: " + (b1+1));
                        System.out.println("ESPECIAL: " + (b2+1));
                        System.out.println("CURA: " + (b3+1));
                        rodada += 1;
                        }
                        if (vidaCPU_Hab != 0) {
                            vidaCPU_Hab += 1;
                            vidaCPU_Atual += 1;
                        }
                        vidaCPU = vidaCPU_Atual;
                        if (vidaUser <= 0) {
                            sol.morrer();
                            System.out.println("\nO Dragao venceu! Quem sabe na proxima voce consiga?");
                            System.out.println("\n=-=-=-= FIM DO JOGO =-=-=-=");
                            break;
                        }
                    }
                    op0 = -1;
                    opUser = -1;
                    System.out.println("\nVoltando ao Menu Iniciar...");
                }
                
                ///////////////////////////////////////////////////////////////////////////////////////
                // Tratamento de Erro:
                
                default -> {
                    System.out.println("\nOpcao invalida. Tente novamente.");
                    op0 = -1;
                }
            }
        }
        
        System.out.println("\nFim do programa! Obrigado por jogar! :)");
        
    }
}
