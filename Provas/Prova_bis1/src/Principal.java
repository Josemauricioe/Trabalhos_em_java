import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {

        Perdido p1 = new Perdido();
        Endereço e1 = new Endereço();
        Caracteristicas c1 = new Caracteristicas();
        Gerenciar g1 = new Gerenciar("Ainda vai pagar?");


        while (true){

            Scanner ler = new Scanner(System.in);
            Scanner ler1 = new Scanner(System.in);

            System.out.println("================================================================");
            System.out.println("                 MENU                   ");
            System.out.println("1 - Exibir o valor total ganho pelas encomendas");
            System.out.println("2 - Exibir a quantidade de encomendas de um determinado cliente");
            System.out.println("3 - Finalizar pedido");
            System.out.println("Digite a opção?");
            int op = ler.nextInt();
            System.out.println("================================================================");

            if (op == 1){

                System.out.println("Total: "+c1.ganhos());

            }
            if (op == 2){
                System.out.println("Qual cliente você deseja ver?");
                System.out.println("1: "+p1.nome);
                int op1 = ler.nextInt();

                if (op1 == 1){
                    System.out.println("Encomenda de "+p1.nome+" é igual a : "+ c1.quantidade);
                }

            }
            if (op == 3){

                System.out.println("Vai pagar agora?");
                String pagar = ler1.nextLine();

                if (pagar.equalsIgnoreCase("Sim")){
                    g1.status = "Finalizando";
                    System.out.println("Status: "+g1.status);
                }
                if (g1.status.equals("Finalizando")){
                    break;
                }
            }

        }

    }
}
