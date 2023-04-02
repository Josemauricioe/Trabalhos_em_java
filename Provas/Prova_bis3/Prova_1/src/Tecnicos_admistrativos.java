import java.util.Scanner;

public class Tecnicos_admistrativos extends Pessoa {

    private String setor;
    Scanner ler = new Scanner(System.in);
    public Tecnicos_admistrativos(){
        super();
        System.out.println("Por favor digite o setor que você trabalha:");
        setor = ler.nextLine();
    }
}
