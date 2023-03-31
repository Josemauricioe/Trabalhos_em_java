import java.util.Scanner;
public class Gerenciar {

    String data_do_pedido;
    String data_de_entrega;
    String status;
    public Gerenciar(String status){
        Scanner ler = new Scanner(System.in);
        System.out.println("");
        System.out.println("Data do pedido? ");
        data_do_pedido = ler.nextLine();
        System.out.println("Data de entrega? ");
        data_de_entrega = ler.nextLine();
        System.out.println("");


    }



}
