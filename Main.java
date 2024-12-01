import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Único scanner utilizado no código

        while (true) {  // Laço para permitir repetir a execução se necessário
            System.out.println("Olá, bem-vindo(a) ao Festshows, Uma ferramenta para usuários maior de idade cujo o jetivo é auxiliar você Festeiro a escolher qual show deseja ir e quais combos(Bebidas/Comidas) deseja consumir");

            // Solicita o nome do cliente
            System.out.print("Primeiramente, digite seu nome: ");
            String nomeCliente = scanner.nextLine();

            System.out.println("Bem-vindo(a), " + nomeCliente + "!");

            // Pergunta se o usuário é maior de idade
            System.out.println("Você é maior de idade? Digite (1) Sim ou (2) não:");
            int resposta = scanner.nextInt();  // Converte a resposta para minúsculas

         // Laço while para garantir que o usuário digite 'sim' ou 'não'
         while (resposta != 1 && resposta != 2) {
             System.out.println("Resposta inválida! Por favor, digite 1 para 'sim' ou 2 para 'não'.");
             resposta = scanner.nextInt();
         }

         // Se a resposta for "não", encerra o programa
         if (resposta == 1) {
             System.out.println("Que ótimo, podemos prosseguir");
             
         } else {
             // Se a resposta for "sim", prossegue
             System.out.println("Você não é maior de idade. Obrigado por acessar Festshows, nos vemos na próxima.");
             return; // sai do método e encerra o programa
         }     

            /*Laço principal para permitir refazer o pedido */
            while (true) {
                int escolhaShow = 0;
                int escolhaComida = 0;
                int escolhaBebida = 0;
                double total = 0;

                String showEscolhido = "";
                String comidaEscolhida = "";
                String bebidaEscolhida = "";

                clearScreen();  

                /*Laço escolha do show */
                System.out.println("Escolha um show: ");
                System.out.println("(1) Show de Rock - R$:45,00");
                System.out.println("(2) Show de Samba - R$:50,00");
                System.out.println("(3) Show de Brega - R$:20,00");
                System.out.println("(4) Show de Pagode - R$:30,00");
                System.out.println("(0) Não quero ir ao show");

                while (true) {
                    escolhaShow = scanner.nextInt();
                    if (escolhaShow == 1) {
                        showEscolhido = "Rock";
                        total += 45.00;
                        break;
                    } else if (escolhaShow == 2) {
                        showEscolhido = "Samba";
                        total += 50.00;
                        break;
                    } else if (escolhaShow == 3) {
                        showEscolhido = "Brega";
                        total += 30.00;
                        break;
                    } else if (escolhaShow == 4) {
                        showEscolhido = "Pagode";
                        total += 30.00;
                        break;
                    } else if (escolhaShow == 0) {
                        showEscolhido = "Não quero assistir show";
                        break;
                    }
                    else {
                        System.out.println("Opção inválida! Por favor, escolha um número de 0 a 4.");
                    }
                }

                clearScreen();  

                /* Laço escolha da comida */
                System.out.println("Escolha qual comida: ");
                System.out.println("(1) Coxinha - R$:6,00 ");
                System.out.println("(2) Pastel - R$:5,25 ");
                System.out.println("(3) Pão Italiano - R$:7,00 ");
                System.out.println("(4) Enroladinho - R$:7,00 ");
                System.out.println("(0) Não quero comer");

                while (true) {
                    escolhaComida = scanner.nextInt();
                    if (escolhaComida == 1) {
                        comidaEscolhida = "Coxinha";
                        total += 6.00;
                        break;
                    } else if (escolhaComida == 2) {
                        comidaEscolhida = "Pastel";
                        total += 5.25;
                        break;
                    }  else if (escolhaComida == 3) {
                        comidaEscolhida = "Pão Italiano";
                        total += 7.00;
                        break;
                    } else if (escolhaComida == 4) {
                        comidaEscolhida = "Enroladinho";
                        total += 7.00;
                        break;   
                    }else if (escolhaComida == 0) {
                        comidaEscolhida = "Não quero comida";
                        break;   
                    }
                    else {
                        System.out.println("Opção inválida! Por favor, escolha um número de 0 a 4.");
                    }
                }
                clearScreen();  

                /*Laço escolha da bebida */
                System.out.println("Escolha qual Bebida: ");
                System.out.println("(1) Whisky e Redbull - R$:12,00 ");
                System.out.println("(2) Cerveja latão - R$:7,00 ");
                System.out.println("(3) Coca-cola Lata - R$:5,00 ");
                System.out.println("(4) Água 250ml - R$:3,25 ");       
                System.out.println("(0) Não quero bebida");

                while (true) {
                    escolhaBebida = scanner.nextInt();
                    if (escolhaBebida == 1) {
                        bebidaEscolhida = "Whisky e Redbull";
                        total += 12.00;
                        break;
                    } else if (escolhaBebida == 2) {
                        bebidaEscolhida = "Cerveja Latão";
                        total += 7.00;
                        break;
                    } else if (escolhaBebida == 3) {
                        bebidaEscolhida = "Coca-cola Lata";
                        total += 5.00;
                        break;
                    } else if (escolhaBebida == 4) {
                        bebidaEscolhida = "Água 250ml";
                        total += 3.25;
                        break;
                    }  else if (escolhaBebida == 0) {
                        bebidaEscolhida = "Não quero bebida";
                        break;
                    } else {
                        System.out.println("Opção inválida! Por favor, escolha um número de 0 a 4.");
                    }
                }

                clearScreen();  
               /* If/else impressão das escolhas feitas e a soma do valor total   */
                if (escolhaShow == 0 && escolhaComida == 0 && escolhaBebida == 0) {
                    System.out.println("Não houve pedido!");
                    System.out.println("Deseja começar novamente?");
                    System.out.println("(1) Sim");
                    System.out.println("(2) Não, obrigado.");

                    int reiniciar = scanner.nextInt();
                    scanner.nextLine();

                    if (reiniciar == 1) {
                        clearScreen();
                        continue;  // Reinicia o processo desde o início do laço principal
                    } else {
                        System.out.println("Obrigado por utilizar o Festshows! Até a próxima.");
                        break;  // Sai do laço principal e encerra o programa
                    }
                } else {
                System.out.println(nomeCliente + ", aqui estão as suas escolhas: " +
                        "Show: " + showEscolhido + " (Número: " + escolhaShow + "), " +
                        "Comida: " + comidaEscolhida + " (Número: " + escolhaComida + "), " +
                        "Bebida: " + bebidaEscolhida + " (Número: " + escolhaBebida + "), " +
                        "Total gasto: R$" + total);

                /* If/Else pergunta se o cliente quer refazer o pedido */
                System.out.println("\nDeseja refazer o pedido?");
                System.out.println("(1) Sim");
                System.out.println("(2) Não, obrigado.");
                }
                int refazerPedido = scanner.nextInt();
                scanner.nextLine();  

                if (refazerPedido == 1) {
                    /* Reinicia o laço para refazer o pedido */
                    clearScreen();  
                    continue;  /* Vai para laço escolha show */
                } else {
                    System.out.println("Obrigado pela preferência! Volte sempre.");
                    break;  // Sai do laço principal
                }
            }
            scanner.close();
            break;
        }
    }
    /* Método para limpar a tela */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}