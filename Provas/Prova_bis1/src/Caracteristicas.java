import java.util.Scanner;
public class Caracteristicas {

    String tamanho_camisa;
    String tipo_camisa;
    String cor_camisa;
    String bordado;
    int quantidade;
    int quantidade_de_bordados;
    String frase;
    float total ;

    public Caracteristicas() {
        Scanner ler = new Scanner(System.in);
        Scanner ler1 = new Scanner(System.in);

        System.out.println("================================================================");
        System.out.println("Anotando as Caracteristicas");
        System.out.println("");
        System.out.println("Tamanho da camisa?");
        tamanho_camisa = ler.nextLine();
        System.out.println("Tipo da camisa (normal ou baby look)?");
        tipo_camisa = ler.nextLine();
        System.out.println("Qual a cor da camisa?");
        cor_camisa = ler.nextLine();
        System.out.println("A camisa vai ter bordados (Sim ou Não)?");
        bordado = ler.nextLine();
        if (bordado.equalsIgnoreCase("Sim")) {
            System.out.println("Qual a quatidande ? ");
            quantidade_de_bordados = ler1.nextInt();
        }
        System.out.println("Quantas camisas o senhor(a) dejesa?");
        quantidade = ler1.nextInt();
        System.out.println("Qual a palavra ou frase que você dejesa coloca na camisa?");
        frase = ler.nextLine();
        System.out.println("================================================================");
    }

    public float ganhos(){

        float novo_preco;

        if (cor_camisa.equalsIgnoreCase("Branca") && bordado.equalsIgnoreCase("Sim")){

            novo_preco = quantidade*(15+(10*quantidade_de_bordados));

            total = novo_preco;

        }else if (!cor_camisa.equalsIgnoreCase("Branca") && bordado.equalsIgnoreCase("Sim")){

            novo_preco = quantidade*(20+(10*quantidade_de_bordados));

            total = novo_preco;

        } else if (cor_camisa.equalsIgnoreCase("Branca") && bordado.equalsIgnoreCase("Não")) {
            novo_preco = quantidade*15;

            total = novo_preco;

        } else if (!cor_camisa.equalsIgnoreCase("Branca") && bordado.equalsIgnoreCase("Não")) {
            novo_preco = quantidade*20;

            total = novo_preco;

        }
        return total;
    }

}
