import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Equipes equipes = new Equipes();


        while (true) {

            Scanner ler = new Scanner(System.in);
            System.out.println("================MENU===================");
            System.out.println("1 - Castradar_alleta:");
            System.out.println("2 - Exibir equipe:");
            System.out.println("3 - Mudar Treinador:");
            System.out.println("4 - Exibir dados de um atlata:");
            System.out.println("5 - Exibir todos os dados da equipe:");
            System.out.println("6 - Finalizar dia:");
            System.out.println("7 - Parar programa:");
            System.out.println("=======================================");
            int op = ler.nextInt();
            if (op == 1){
                equipes.castradar_atleta();
            }
            if (op == 2){
                equipes.exibir();
            }
            if (op == 3){
                equipes.mudar_treinador();
            }
            if (op == 4){
                equipes.exibir_de_um_atleta();
            }

            if (op == 5){
                equipes.exibir_equipe();
            }

            if (op == 6){
                equipes.portuacao();
            }

            if (op == 7){

                break;

            }

        }


    }
}