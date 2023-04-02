import java.util.Scanner;

public class Equipes {

    int vetor;

    private Esportes esportes;
    private Atletas[] atletas = new Atletas[vetor];
    private Treinador treinador;
    private Float[] portuacao = new Float[5];


    public Equipes() {

        
        esportes = new Esportes();
        treinador = new Treinador();

    }

    public Esportes getEsportes() {
        return esportes;
    }

    public void setEsportes(Esportes esportes) {
        this.esportes = esportes;
    }


    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }



    public void exibir() {
        

        for (int i = 0; i < atletas.length; i++) {
            int c=1;
            c++;
            System.out.println("Atleta:"+c);
            atletas[i].exibir1();
            System.out.println("================================");
        }
    }


    public void castradar_atleta() {
        Scanner ler_1 = new Scanner(System.in);
        System.out.println("Quantos atletas entrara na sua equipe?");
        vetor = ler_1.nextInt();
        atletas = new Atletas[vetor];
        for (int i = 0; i < atletas.length; i++) {
            atletas[i] = new Atletas();
        }
    }

    public void mudar_treinador() {
        Scanner ler = new Scanner(System.in);
        String novo_treiandor;
        System.out.println("Qual o novo treinador?");
        novo_treiandor = ler.nextLine();
        System.out.println("Qual o curso do novo treinador?");
        String novo_curso_treinador = ler.nextLine();
        System.out.println("Qual o telefone?");
        String novo_telefone = ler.nextLine();

        treinador.setNome(novo_treiandor);
        treinador.setCursp_treinador(novo_curso_treinador);
        treinador.setTelefone(novo_telefone);
    }

    public void exibir_de_um_atleta() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual atleta você que ver os dados?");

        for (int i = 0; i < atletas.length; i++) {
            int c = 1;
            System.out.println("Atleta:" + c);
            atletas[i].exibir2();
        }
        String op = ler.nextLine();

        for (int i_i = 0; i_i < atletas.length; i_i++) {
            if (atletas[i_i].getNome_atleta().equalsIgnoreCase(op)) {
                atletas[i_i].exibir1();
            }
        }

    }

    public void exibir_equipe() {

        esportes.exibir_esportes();
        exibir();
        treinador.exibir_treinnador();
    }

    public void portuacao() {
        int nu = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("Dia:"+nu);
            nu++;
            Scanner ler = new Scanner(System.in);
            System.out.println("Qual foi a portuação da equipe?");
            portuacao[i] = ler.nextFloat();

            if (nu == 6) {
                float total_portuacao;

                total_portuacao = portuacao[i];

                float media;
                media = total_portuacao / 5;
                System.out.println("Media:"+media);
                System.out.println("Fim dos jogos!!!");
            }
        }

    }
}










