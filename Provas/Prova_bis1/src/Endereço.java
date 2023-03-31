import java.util.Scanner;
public class Endereço {

    String cep;
    String rua;
    String cidade;
    String bairro;

    Endereço(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a cidade? ");
        cidade = ler.nextLine();
        System.out.println("Qual o bairro? ");
        bairro = ler.nextLine();
        System.out.println("Qual a rua? ");
        rua = ler.nextLine();
        System.out.println("Qual o cep? ");
        cep =  ler.nextLine();

    }
}
