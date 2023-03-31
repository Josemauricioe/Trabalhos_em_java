import java.util.Scanner;
public class Perdido {

    String nome;
    String telefone;



    Perdido (){
        Scanner ler = new Scanner(System.in);
        System.out.println("Anotando perdido");
        System.out.println("");
        System.out.println("Nome do senhor por favor: ");
        nome = ler.nextLine();
        System.out.println("Telefone do senhor por favor: ");
        telefone = ler.nextLine();


    }


}
