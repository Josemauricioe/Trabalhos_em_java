import java.util.Scanner;

public class Professor extends Pessoa {

    private String area;
    Scanner ler = new Scanner(System.in);

    public Professor(){

        super();
        System.out.println("Em que area você trabalha:");
        System.out.println("1 - INFORMÁTICA\n2 - ELETRO\n3 - FORMAÇÃO GERAL");
        int op = ler.nextInt();
        switch (op){
            case 1:
                area = "INFORMÁTICA";
                break;
            case 2:
                area = "ELETRO";
                break;
            case 3:
                area = "FORMAÇÃO GERAL";
                break;
            default:
                System.out.println("Digite um opção valida!!!!!");
        }

    }

}
